package com.ykly.service;

public interface MqTestService {
    String fanoutTest(String fanoutMsg);

    String directTest(String directMsg);

    String topicTest(String topictMsg);

    String delayTest(String delayMsg);
}
