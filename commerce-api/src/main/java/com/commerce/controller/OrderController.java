package com.commerce.controller;

import com.commerce.domain.model.MyOrder;
import com.commerce.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<MyOrder> findById(@PathVariable Long id) {
        var order = orderService.findById(id);
        return ResponseEntity.ok((MyOrder) order);
    }

    @PostMapping
    public ResponseEntity<MyOrder> create(@RequestBody MyOrder orderToCreate) {
        var orderCreated = orderService.create(orderToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(orderCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(orderCreated);
    }
}
