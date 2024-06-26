package com.commerce.domain.repository;

import com.commerce.domain.model.CartItem;
import com.commerce.domain.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

