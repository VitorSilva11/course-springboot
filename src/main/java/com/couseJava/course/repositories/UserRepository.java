package com.couseJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couseJava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
