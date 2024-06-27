package com.commerce.service.impl;

import com.commerce.domain.model.MyOrder;
import com.commerce.domain.repository.OrderRepository;
import com.commerce.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public MyOrder findById(Long id) {
        return orderRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public MyOrder create(MyOrder orderToCreate) {
        if (orderRepository.existsById(orderToCreate.getId())) {
            throw new IllegalArgumentException("This order number already exists.");
        }
        return orderRepository.save(orderToCreate);
    }
}