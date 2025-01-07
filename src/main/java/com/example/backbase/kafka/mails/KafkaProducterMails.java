package com.example.backbase.kafka.mails;

import com.example.backbase.dtos.BodyMail;
import jakarta.annotation.PreDestroy;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducterMails {

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;
    @Bean
    public DefaultKafkaProducerFactory<String, BodyMail> kafkaProducerMails() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(
                ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
                bootstrapServers);
        configProps.put(
                ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                StringSerializer.class);
        configProps.put(
                ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                JsonSerializer.class);

        return new DefaultKafkaProducerFactory<>(configProps);
    }
    @Bean
    public KafkaTemplate<String, BodyMail> kafkaTemplateMails() {
        return new KafkaTemplate<>(kafkaProducerMails());
    }

    @PreDestroy
    public void destroy() {
        kafkaProducerMails().destroy();

    }

}
