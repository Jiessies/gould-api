package com.ykly.listener;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;
import com.rabbitmq.client.Channel;
import com.ykly.entity.request.geocoding.GeoCoding;
import com.ykly.mq.ZoListenerHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by huangmingjie on 2018/1/3.
 */
public class SendCommonWeixinQListener implements ChannelAwareMessageListener {
    
    private static final Logger logger = LoggerFactory.getLogger(SendCommonWeixinQListener.class);
    
    private TypeReference<GeoCoding> tr;
    
    @PostConstruct
    public void init() {
        tr = new TypeReference<GeoCoding>(){};
    }
    
    @Autowired
    ZoListenerHelper mqHelper;
    
    @Override
    public void onMessage(Message message, Channel channel) {
        try {
            GeoCoding geoCoding = JSON.parseObject(message.getBody(),GeoCoding.class);
            logger.info("json string is:{}", geoCoding);
        } catch (Throwable e) {
            logger.error("SendCommonSmsQListener sss process message failed", e);
        } finally {
            mqHelper.sendAck(message, channel);
        }
    }
}
