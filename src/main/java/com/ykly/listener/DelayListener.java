package com.ykly.listener;

import com.rabbitmq.client.Channel;
import com.ykly.mq.ZoListenerHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by huangmingjie on 2018/7/1.
 */
public class DelayListener implements ChannelAwareMessageListener {
    
    private static final Logger logger = LoggerFactory.getLogger(DelayListener.class);

    @Autowired
    @Qualifier("delayTemplate")
    private AmqpTemplate delayTemplate;

    @Autowired
    ZoListenerHelper mqHelper;
    
    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        boolean subType = true;
        try {
            String jsonStr = new String(message.getBody());
            if(jsonStr.contains("huangmingjie")){
                delayTemplate.convertAndSend("delay_queue",jsonStr.replace("huangmingjie","_F222"));
            }
            logger.info("DelayListener=======>"+jsonStr);
        } catch (Throwable e) {
            subType = false;
            logger.error("DelayListener ç process message failed", e);
        } finally {
            mqHelper.sendAck(message, channel, subType);
            logger.info("DelayListener finally");
        }
    }

    public static void main(String[] args) {
        String jsonStr = "dsagsdhsh____huangmingjie";
        String b= jsonStr.replace("huangmingjie","f11");
        System.out.println(b);
    }
}
