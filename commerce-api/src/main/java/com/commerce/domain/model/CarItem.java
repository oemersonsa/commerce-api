package com.commerce.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_car_items")
public class CarItem extends Item{
    public CarItem(Long productId, int quantity) {
        super(productId, quantity);
    }
}
