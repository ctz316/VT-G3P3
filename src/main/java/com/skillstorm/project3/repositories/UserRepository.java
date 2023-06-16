package com.skillstorm.project3.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.project3.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	public ArrayList<User> findByEmail(String email);
	
	public User findByEmailAndPassword(String email, String password);
}
