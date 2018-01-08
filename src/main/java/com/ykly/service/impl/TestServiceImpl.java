package com.ykly.service.impl;

import com.ykly.datasource.RoutingDataSource;
import com.ykly.mapper.TestMapper;
import com.ykly.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        logger.info(orderNo + "info");
        RoutingDataSource.setDataSourceKey(RoutingDataSource.getDataSourceOrderOther());
        return testMapper.findOrder(orderNo);
    }
}
