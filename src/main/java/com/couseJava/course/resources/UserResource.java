package com.couseJava.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.couseJava.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User user = new User(1L, "Vitor Yago", "vitoryago@gmail.com", "91068271", "1234");
		
		return ResponseEntity.ok().body(user);
		
	}
	
}
