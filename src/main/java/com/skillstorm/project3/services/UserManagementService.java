package com.skillstorm.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.project3.models.PermissionLevel;
import com.skillstorm.project3.models.User;
import com.skillstorm.project3.models.UserSalt;
import com.skillstorm.project3.repositories.PermissionLevelRepository;
import com.skillstorm.project3.repositories.UserRepository;
import com.skillstorm.project3.repositories.UserSaltRepository;

@Service
public class UserManagementService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserSaltRepository userSaltsRepo;
	
	@Autowired
	private PermissionLevelRepository permissionsRepo;
	
	public User getUser(int id) {
		if(userRepo.existsById(id)) {
			return userRepo.findById(id).get();
		} else {
			return null;
		}
	}
	
	public Iterable<User> getAllUsers() {
		return userRepo.findAll();
	}
	
	public UserSalt getUserSalt(int id) {
		if(userSaltsRepo.existsById(id)) {
			return userSaltsRepo.findById(id).get();
		} else {
			return null;
		}
	}
	
	public PermissionLevel getUserPermissions(int id) {
		if(permissionsRepo.existsById(id)) {
			return permissionsRepo.findById(id).get();
		} else {
			return null;
		}
	}
}
