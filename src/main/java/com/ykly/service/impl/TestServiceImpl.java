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
import java.util.Random;
import java.util.UUID;

/**
 * Created by huangmingjie on 2018/1/3.
 */
@Service
public class TestServiceImpl implements TestService {
    private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
    
    @Autowired
    private TestMapper testMapper;
    
    @Override
    public String findOrder(String orderNo) {
        logger.info(orderNo + ": info Test");
        RoutingDataSource.setDataSourceKey(RoutingDataSource.getDataSourceOrderOther());
        return testMapper.findOrder(orderNo);
    }
    
    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    public String txTest(String orderNo){
        int flag;
        logger.info(orderNo + ": Tx Test");
        RoutingDataSource.setDataSourceKey(RoutingDataSource.getDataSourceOrderOther());
        Order order = new Order();
        order.setOrderNo(String.valueOf(UUID.randomUUID()));
        order.setCreatetime(new Date());
        order.setOrderprice(100);
        order.setOrderstatus(1);
        flag = testMapper.insertOrder(order);
        logger.info("insertOrder :{}",flag);
        if(flag == 1){
            logger.error("RuntimeException flag :{}",flag);
            throw new RuntimeException();
        }
        flag = testMapper.updateOrder(orderNo);
        logger.info("updateOrder :{}",flag);
        return flag!=0?"succ":"fail";
    }
}
