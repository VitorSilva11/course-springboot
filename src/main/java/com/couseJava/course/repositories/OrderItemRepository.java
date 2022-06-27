package com.couseJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couseJava.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
