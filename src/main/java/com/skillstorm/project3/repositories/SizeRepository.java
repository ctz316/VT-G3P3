package com.skillstorm.project3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.project3.models.Size;

@Repository
public interface SizeRepository extends CrudRepository<Size, Integer>{
	
	
}
