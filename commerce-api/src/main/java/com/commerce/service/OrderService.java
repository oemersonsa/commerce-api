package com.commerce.service;

import com.commerce.domain.model.MyOrder;

public interface OrderService {

    MyOrder findById(Long id);

    MyOrder create(MyOrder orderToCreate);


}