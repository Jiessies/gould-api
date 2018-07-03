package com.ykly.controller;

import com.ykly.service.MqTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mq")
public class MqTestController {

    @Autowired
    private MqTestService mqTestService;

    @GetMapping(value = "/fanout/{fanoutMsg}")
    public String fanoutTest(@PathVariable String fanoutMsg) {
        return mqTestService.fanoutTest(fanoutMsg);
    }

    @GetMapping(value = "/direct/{directMsg}")
    public String directTest(@PathVariable String directMsg) {
        return mqTestService.directTest(directMsg);
    }

    @GetMapping(value = "/topic/{topictMsg}")
    public String topicTest(@PathVariable String topictMsg) {
        return mqTestService.topicTest(topictMsg);
    }

    @GetMapping(value = "/delay/{delayMsg}")
    public String delayTest(@PathVariable String delayMsg) {
        return mqTestService.delayTest(delayMsg);
    }
}
