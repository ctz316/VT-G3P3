package com.skillstorm.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.project3.models.User;
import com.skillstorm.project3.services.UserManagementService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserManagementController {
	
	@Autowired
	UserManagementService userServ;
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable int id) {
		return userServ.getUser(id);
	}
	
	@GetMapping("/all")
	public Iterable<User> getAllUsers() {
		return userServ.getAllUsers();
	}
}
