package com.skillstorm.project3.repositories;

import org.springframework.data.repository.CrudRepository;

import com.skillstorm.project3.models.UserSalt;

public interface UserSaltRepository extends CrudRepository<UserSalt, Integer> {

}
