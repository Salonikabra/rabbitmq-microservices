package com.example.OrderRabbitmq.Publisher;

import com.example.OrderRabbitmq.DTO.OrderEvent;
import com.example.OrderRabbitmq.config.RabbitmyConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderPublisher {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendOrderEvent(OrderEvent event) {
        rabbitTemplate.convertAndSend(RabbitmyConfig.queue, event);
    }
}
