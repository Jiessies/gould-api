package com.ykly.service.impl;

import com.ykly.service.MqTestService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MqTestServiceImpl implements MqTestService {

    @Autowired
    @Qualifier("fanoutTemplate")
    private AmqpTemplate fanoutTemplate;

    @Autowired
    @Qualifier("directTemplate")
    private AmqpTemplate directTemplate;

    @Autowired
    @Qualifier("topicTemplate")
    private AmqpTemplate topicTemplate;

    @Autowired
    @Qualifier("delayTemplate")
    private AmqpTemplate delayTemplate;

    @Override
    public String fanoutTest(String fanoutMsg) {
        fanoutTemplate.convertAndSend(fanoutMsg);
        return "success" + " fanout:" + fanoutMsg;
    }

    @Override
    public String directTest(String directMsg) {
        directTemplate.convertAndSend("huangmingjie111key", directMsg);
        directTemplate.convertAndSend("huangmingjie222key", directMsg);
        return "success" + " direct:" + directMsg;
    }

    @Override
    public String topicTest(String topictMsg) {
        topicTemplate.convertAndSend("ashgah.sdghals.topic.huangmingjie111", topictMsg);
        topicTemplate.convertAndSend("topic.huangmingjie222.key", topictMsg);
        return "success" + " topic:" + topictMsg;
    }

    @Override
    public String delayTest(String delayMsg) {
//        delayTemplate.convertAndSend("delay_queue", delayMsg);
        delayTemplate.convertAndSend("task_queue", delayMsg+"huangmingjie");
        return "success" + " delay:" + delayMsg;
    }
}
