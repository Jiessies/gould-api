package com.ykly.mq;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.Connection;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ZoListenerHelper {
    
    private static final Logger logger = LoggerFactory.getLogger(ZoListenerHelper.class);
    
    @Autowired
    private ConnectionFactory factory;
    
    @PostConstruct
    public void init() {
        try {
            logger.info("Asking rabbitMQ to resend unacknowledged messages.");
            Connection connection = factory.createConnection();
            Channel channel = connection.createChannel(false);
            channel.basicRecover();
            channel.close();
            connection.close();
            logger.info("Asked rabbitMQ to resend unacknowledged messages.");
        } catch (Throwable e) {
            logger.error("Ask rabbitMQ to resend unacknowledged messages failed", e);
        }
        
    }
    
    public void sendAck(Message message, Channel channel, Boolean subType) {
        try {
            if(subType){
                //消息的标识，false只确认当前一个消息收到，true确认所有consumer获得的消息
                channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            }else {
                //ack返回false，并重新回到队列，api里面解释得很清楚
                channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
            }
            //拒绝消息
//            channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
        } catch (Throwable e) {
            logger.error("MQ listener send ACK error", e);
        }
    }
    
}
