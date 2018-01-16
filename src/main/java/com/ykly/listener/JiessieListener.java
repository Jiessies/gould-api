package com.ykly.listener;

import com.rabbitmq.client.Channel;
import com.ykly.mq.ZoListenerHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by huangmingjie on 2018/1/15.
 */
public class JiessieListener implements ChannelAwareMessageListener {
    
    private static final Logger logger = LoggerFactory.getLogger(JiessieListener.class);
    
    @Autowired
    ZoListenerHelper mqHelper;
    
    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        try {
            String jsonStr = new String(message.getBody());
            logger.info("=======>"+jsonStr);
        } catch (Throwable e) {
            logger.error("SendCommonSmsQListener xxttttx process message failed", e);
        } finally {
            mqHelper.sendAck(message, channel);
        }
    }
}
