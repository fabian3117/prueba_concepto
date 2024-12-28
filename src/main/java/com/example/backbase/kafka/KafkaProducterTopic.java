package com.example.backbase.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration

public class KafkaProducterTopic {
    @Value("${spring.kafka.topic_cambio_compras}")
    private  String topicErrorF;
    @Bean
    public NewTopic topicErrorFacturacion(){
//        return new NewTopic(topicErrorF, 1, (short) 1);

        return TopicBuilder.name(topicErrorF).build();
    }
}
