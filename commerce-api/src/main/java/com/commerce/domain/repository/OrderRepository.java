package com.commerce.domain.repository;

import com.commerce.domain.model.MyOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<MyOrder, Long> {
}
