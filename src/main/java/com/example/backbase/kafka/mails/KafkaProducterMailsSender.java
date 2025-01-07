package com.example.backbase.kafka.mails;

import com.example.backbase.dtos.BodyMail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaProducterMailsSender {

    @Value("${spring.kafka.mailstopic}")
    private String mailsStopic;
    @Autowired
    private KafkaTemplate<String, BodyMail> kafkaProducterMails;
    public void sendMail(BodyMail bodyMail) {
        log.info("Sending : {}", bodyMail);
        log.info("--------------------------------");

        kafkaProducterMails.send(mailsStopic,bodyMail);
    }
}
