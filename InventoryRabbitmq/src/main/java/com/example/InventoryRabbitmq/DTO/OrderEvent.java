package com.example.InventoryRabbitmq.DTO;

import lombok.Data;

@Data
public class OrderEvent {

    private String orderId;
    private String productId;
    private int quantity;

}
