package com.olive.consumer;

import com.olive.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "kafka-test-object",groupId = "con-objgrp")
    public void consume(Customer customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }

//    @KafkaListener(topics = "kafka-test-obj",groupId = "con-objgroup")
//    public void consumer1(String message) {
//        log.info("consumer1 consume the events {} ", message);
//    }

//    @KafkaListener(topics = "kafka-test1",groupId = "con-group")
//    public void consumer2(String message) {
//        log.info("consumer2 consume the events {} ", message);
//    }
//    @KafkaListener(topics = "kafka-test1",groupId = "con-group")
//    public void consumer3(String message) {
//        log.info("consumer3 consume the events {} ", message);
//    }
//    @KafkaListener(topics = "kafka-test1",groupId = "con-group")
//    public void consumer4(String message) {
//        log.info("consumer4 consume the events {} ", message);
//    }
}
