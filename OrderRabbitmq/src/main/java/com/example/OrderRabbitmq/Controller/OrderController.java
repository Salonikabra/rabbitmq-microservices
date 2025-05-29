package com.example.OrderRabbitmq.Controller;

import com.example.OrderRabbitmq.DTO.OrderEvent;
import com.example.OrderRabbitmq.Publisher.OrderPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderPublisher publisher;

    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody OrderEvent event) {
        publisher.sendOrderEvent(event);
        return ResponseEntity.ok("Order sent to inventory");
    }
}
