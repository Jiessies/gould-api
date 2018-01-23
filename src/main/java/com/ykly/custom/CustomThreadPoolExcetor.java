package com.ykly.custom;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;

/**
 * Created by huangmingjie on 2018/1/23.
 */
public class CustomThreadPoolExcetor {
    private static ExecutorService executorService;
    
    public static ExecutorService setCustomThreadPoolExcetor(int corePoolSize,
                                                             int maximumPoolSize,
                                                             long keepAliveTime) {
        executorService = new ThreadPoolExecutor(corePoolSize, maximumPoolSize,
                keepAliveTime, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(5),new ThreadPoolExecutor.AbortPolicy());
        return executorService;
    }
}
