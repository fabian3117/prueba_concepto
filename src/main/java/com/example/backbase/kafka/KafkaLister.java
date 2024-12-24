package com.example.backbase.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
/*
@Component
@Slf4j
public class KafkaLister {

    @Value("${spring.kafka.topic_cambio_compras}")
    private String topic_cambio_compras;

    @KafkaListener(topicPattern = "topic_cambio_compras", groupId = "group1")
    void listener(String data) {

        System.out.println(data);
    }
}


 */