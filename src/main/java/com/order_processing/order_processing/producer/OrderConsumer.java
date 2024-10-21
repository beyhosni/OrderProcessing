package com.order_processing.order_processing.producer;

import com.order_processing.order_processing.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    @KafkaListener(topics = "orders", groupId = "order_group")
    public void consume(Order order) {
        System.out.println("Commande reçue : " + order);

    }
}
