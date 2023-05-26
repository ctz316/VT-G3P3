package com.skillstorm.project3.repositories;

import org.springframework.data.repository.CrudRepository;

import com.skillstorm.project3.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
