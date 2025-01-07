package com.example.backbase.kafka.mails;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducterTopicMails {

    @Value("${spring.kafka.mailstopic}")
    private String mailStopic;
    @Bean
    public NewTopic topicMails() {
        return new NewTopic(mailStopic, 1, (short) 1);
    }
}
