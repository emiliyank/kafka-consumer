package com.example.kafkaconsumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaConsumer1Application {
	@KafkaListener(topics = {"mytopic", "mqtt"})
	public void getKafkaListenerMessage(String customMessage) {
		System.out.println("Message consumed: " + customMessage);
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumer1Application.class, args);
	}

}
