package com.example.OrderRabbitmq.DTO;


import lombok.Data;

@Data
public class OrderEvent {

    private String orderId;
    private String userId;
    private int quantity;
}
