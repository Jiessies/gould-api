package com.ykly.listener;

import com.rabbitmq.client.Channel;
import com.ykly.mq.ZoListenerHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by huangmingjie on 2018/7/1.
 */
public class DelayListener implements ChannelAwareMessageListener {
    
    private static final Logger logger = LoggerFactory.getLogger(DelayListener.class);
    
    @Autowired
    ZoListenerHelper mqHelper;
    
    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        boolean subType = true;
        try {
            String jsonStr = new String(message.getBody());
            logger.info("DelayListener=======>"+jsonStr);
        } catch (Throwable e) {
            subType = false;
            logger.error("DelayListener ç process message failed", e);
        } finally {
            mqHelper.sendAck(message, channel, subType);
            logger.info("DelayListener finally");
        }
    }
}
