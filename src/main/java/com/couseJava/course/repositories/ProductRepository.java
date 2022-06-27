package com.couseJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couseJava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
