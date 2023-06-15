package com.skillstorm.project3.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.project3.models.PermissionLevel;
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
		return userServ.getUserById(id);
	}
	
	@GetMapping("/all")
	public Iterable<User> getAllUsers() {
		return userServ.getAllUsers();
	}
	
	
	@PostMapping("/new")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		if (!userServ.checkUserExists(user.getUserId())) {
			User temp = userServ.addUser(user);
			if (temp != null) {
				return ResponseEntity.status(HttpStatus.CREATED).body(temp);
			}
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
	}
	
	@PutMapping("/upd")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		System.out.println("put mapping");
		if(user != null && userServ.checkUserExists(user.getUserId())) {
			return ResponseEntity.status(HttpStatus.OK).body(userServ.updateUser(user));
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		
	}
	
	@DeleteMapping("/del/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable int id) {
		if (userServ.deleteById(id)) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}

	
}
