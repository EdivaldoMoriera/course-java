package com.valdosm.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdosm.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
    
}
