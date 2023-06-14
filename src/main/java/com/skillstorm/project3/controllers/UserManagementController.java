package com.skillstorm.project3.controllers;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.project3.models.Inventory;
import com.skillstorm.project3.models.PermissionLevel;
import com.skillstorm.project3.models.User;
import com.skillstorm.project3.services.InventoryService;
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
		if (userServ.checkUserExists(user.getUserId()))  {
			return ResponseEntity.status(HttpStatus.CREATED).body(userServ.addUser(user));
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);			
		}
	}
	
	@PutMapping("/upd/{id}")
	public ResponseEntity<User> updateUser(@PathVariable int id,
										   @RequestParam(name = "email", required = false) String email,
										   @RequestParam(name = "password", required = false) String password,
										   @RequestParam(name = "permissionLevel", required = false) String permissionLevel) {
		
		if(userServ.checkUserExists(id)) {
			User tempU = userServ.getUserById(id);
			
			if(email != null && email != tempU.getEmail()) {
				tempU.setEmail(email);
			}
			
			if(password != null && password != tempU.getPassword()) {
				tempU.setPassword(password);
			}
			
			if(permissionLevel != null && Integer.valueOf(permissionLevel) != tempU.getPermissionLevel().getPermissionsId()) {
				PermissionLevel tempPL = new PermissionLevel();
				tempPL.setPermissionId(Integer.valueOf(permissionLevel));
				tempU.setPermissionLevel(tempPL);
			}
			return ResponseEntity.status(HttpStatus.OK).body(userServ.updateUser(tempU));
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
