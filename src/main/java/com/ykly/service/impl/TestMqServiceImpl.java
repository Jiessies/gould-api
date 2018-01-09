package com.ykly.service.impl;

import com.ykly.entity.request.geocoding.GeoCoding;
import com.ykly.mq.TestMqConst;
import com.ykly.service.TestMqService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by huangmingjie on 2018/1/9.
 */
@Service
public class TestMqServiceImpl implements TestMqService{
    
    private static final Logger logger = LoggerFactory.getLogger(TestMqServiceImpl.class);
    
    @Autowired
    @Qualifier("jsonRabbitTemplate")
    private AmqpTemplate amqpTemplate;
    
    @Override
    public String sendMessage(Object obj) {
        logger.info("order.type is 24 send TaskCallBackQueue, jobAddReq:{}",obj);
        amqpTemplate.convertAndSend(TestMqConst.CommonSmsQ,obj);
        amqpTemplate.convertAndSend(TestMqConst.CommonWeixinQ,getGeoCoding());
        return "succ";
    }
    
    private GeoCoding getGeoCoding(){
        GeoCoding geoCoding = new GeoCoding();
        geoCoding.setAddress("北京");
        geoCoding.setCallback("http://localhost:8080/sss");
        geoCoding.setCity("beijing");
        geoCoding.setKey("UUUUUUUUUUUU");
        geoCoding.setSig("");
        return geoCoding;
    }
}
