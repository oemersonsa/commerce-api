package com.commerce.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_order_items")
public class OrderItem extends Item{
    public OrderItem(Long productId, int quantity) {
        super(productId, quantity);
    }
}
