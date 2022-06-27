package com.couseJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couseJava.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
