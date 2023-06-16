package com.skillstorm.project3.services;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

//import com.skillstorm.project3.models.PermissionLevel;
import com.skillstorm.project3.models.User;
import com.skillstorm.project3.repositories.PermissionLevelRepository;
import com.skillstorm.project3.repositories.UserRepository;

@Service
public class UserManagementService {
	
	@Autowired
	private UserRepository userRepo;
	
//	@Autowired
//	private PermissionLevelRepository permissionsRepo;	
	
	public User getUserById(int id) {
		if (checkUserExists(id)) {
			return userRepo.findById(id).get();
		} else {
			return null;
		}
	}
	
	public ArrayList<User> getUserByEmail(String email) {
		try {
			return userRepo.findByEmail(email);
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	
	public boolean checkUserExists(int id) {
		return userRepo.existsById(id);
	}
	
	public Iterable<User> getAllUsers() {
		return userRepo.findAll();
	}
	
	public User addUser(User user) {		
		if (!checkUserExists(user.getUserId())) {
			ArrayList<User> checkUsers = getUserByEmail(user.getEmail());
			if (checkUsers.size() == 0) {
				return userRepo.save(user);
			}
		}
		
		return null;
	}
	
	public User updateUser(User user) {
		if (checkUserExists(user.getUserId())) {
			return userRepo.save(user);
		}
		
		return null;		
	}
	
	public boolean deleteById(int id) {
		if (checkUserExists(id)) {
			userRepo.deleteById(id);
			return !checkUserExists(id);
		} else {
			return checkUserExists(id);
		}
	}
	
	public User authUser(User u) {
		if (u != null) {
			return userRepo.findByEmailAndPassword(u.getEmail(), u.getPassword());
		}
		return null;
	}
	
	// PERMISSIONS
//	public PermissionLevel getUserPermissionLevel(User user) {
//		if (user != null) {
//			return permissionsRepo.findById(user.getPermissionLevel().getPermissionsId()).get();
//		} else {
//			return null;
//		}
//	}	
}
