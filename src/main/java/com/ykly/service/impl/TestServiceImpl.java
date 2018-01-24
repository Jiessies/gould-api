package com.ykly.service.impl;

import com.ykly.datasource.RoutingDataSource;
import com.ykly.entity.request.order.Order;
import com.ykly.mapper.TestMapper;
import com.ykly.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.*;

/**
 * Created by huangmingjie on 2018/1/3.
 */
@Service
public class TestServiceImpl implements TestService {
    private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
    
    @Autowired
    private TestMapper testMapper;
    
    @Autowired
    private ExecutorService executorServiceJ;
    
    @Override
    public String findOrder(String orderNo) {
        logger.info(orderNo + ": info Test");
        RoutingDataSource.setDataSourceKey(RoutingDataSource.getDataSourceOrderOther());
        return testMapper.findOrder(orderNo);
    }
    
    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    public String txTest(String orderNo) {
        int flag;
        logger.info(orderNo + ": Tx Test");
        RoutingDataSource.setDataSourceKey(RoutingDataSource.getDataSourceOrderOther());
        Order order = new Order();
        order.setOrderNo(String.valueOf(UUID.randomUUID()));
        order.setCreatetime(new Date());
        order.setOrderprice(100);
        order.setOrderstatus(1);
        flag = testMapper.insertOrder(order);
        logger.info("insertOrder :{}", flag);
        if (flag == 1) {
            logger.error("RuntimeException flag :{}", flag);
            throw new RuntimeException();
        }
        flag = testMapper.updateOrder(orderNo);
        logger.info("updateOrder :{}", flag);
        return flag != 0 ? "succ" : "fail";
    }
    
    @Override
    public String testJavaPool(int size) {
        CountDownLatch countDownLatch = new CountDownLatch(size);
        CompletionService<String> completionService = new ExecutorCompletionService<String>(executorServiceJ);
        
        for (int i = 0; i < size; i++) {
            int finalI = i;
            executorServiceJ.execute(new Runnable() {
                @Override
                public void run() {
                    logger.info("进入线程池:" + finalI);
                }
            });
        }
        try {
            for(int i = 0; i < size; i++){
                completionService.submit(new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        countDownLatch.countDown();
                        return "completion";
                    }
                });
            }
            countDownLatch.await();
            System.out.println("===>"+completionService.take().get());
            Future future = executorServiceJ.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("succ");
                }
            }, String.class);
            System.out.println("===>"+future.get());
    
            Future<?> future1 = executorServiceJ.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("succ1");
                }
            });
            System.out.println("===>"+future1.get());
    
            Future<String> future2 = executorServiceJ.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return "succ2";
                }
            });
            System.out.println("===>"+future2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorServiceJ.shutdown();
    
        //FutureTask
        Callable<String> task = new Callable<String>() {
            public String call() {
                System.out.println("Sleep start.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("Sleep end.");
                return "time=" + System.currentTimeMillis();
            }
        };
    
        //直接使用Thread的方式执行
        FutureTask<String> ft = new FutureTask<String>(task);
        Thread t = new Thread(ft);
        t.start();
        try {
            System.out.println("result = " + ft.get());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
        //使用Executors来执行
        System.out.println("=========");
        FutureTask<String> ft2 = new FutureTask<String>(task);
        Executors.newSingleThreadExecutor().submit(ft2);
        try {
            System.out.println("result = " + ft2.get());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "succ";
    }
}
