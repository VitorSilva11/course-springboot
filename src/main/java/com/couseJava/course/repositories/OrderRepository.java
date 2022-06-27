package com.couseJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couseJava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
