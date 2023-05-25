package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.UserPermissions;
import models.UserSalts;
import models.Users;
import repositories.PermissionsRepository;
import repositories.UserSaltsRepository;
import repositories.UsersRepository;

@Service
public class UserManagementService {
	
	@Autowired
	private UsersRepository usersRepo;
	
	@Autowired
	private UserSaltsRepository userSaltsRepo;
	
	@Autowired
	private PermissionsRepository permissionsRepo;
	
	public Users getUser(int id) {
		if(usersRepo.existsById(id)) {
			return usersRepo.findById(id).get();
		} else {
			return null;
		}
	}
	
	public UserSalts getUserSalt(int id) {
		if(userSaltsRepo.existsById(id)) {
			return userSaltsRepo.findById(id).get();
		} else {
			return null;
		}
	}
	
	public UserPermissions getUserPermissions(int id) {
		if(permissionsRepo.existsById(id)) {
			return permissionsRepo.findById(id).get();
		} else {
			return null;
		}
	}
}
