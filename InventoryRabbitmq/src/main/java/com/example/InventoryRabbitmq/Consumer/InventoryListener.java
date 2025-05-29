package com.example.InventoryRabbitmq.Consumer;

import com.example.InventoryRabbitmq.Config.RabbitmyConfig;
import com.example.InventoryRabbitmq.DTO.OrderEvent;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class InventoryListener {

    @RabbitListener(queues = RabbitmyConfig.queue)
        public void handleInventoryUpdate(OrderEvent event) {
        System.out.println("Received order for inventory update: " + event.getOrderId());
    }
}
