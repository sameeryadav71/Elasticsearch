package com.web.elasticsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.web.elasticsearch.model.User;
import com.web.elasticsearch.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/findAll")
	public Iterable<User> findAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/findByFName/{firstName}")
	public List<User> findByFirstName(@PathVariable String firstName) {
		return userRepository.findByFirstname(firstName);
	}
	
	

}
