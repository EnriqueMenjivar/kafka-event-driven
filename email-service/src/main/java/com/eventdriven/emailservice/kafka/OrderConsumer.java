package com.eventdriven.emailservice.kafka;

import com.eventdriven.basedomain.event.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderConsumer {

    @KafkaListener(topics = "${spring.kafka.topic-name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event) {
        log.info("Order event received in stock service => {}", event.toString());

        // Send email to the customer
    }
}
