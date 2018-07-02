package com.ykly.service;

/**
 * Created by huangmingjie on 2018/1/9.
 */
public interface TestMqService {
    String sendMessage(Object obj);
    String send1Message(Object obj);
    String sendDelayQueue(Object obj);
}
