package com.skillstorm.project3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.project3.models.Caliber;

@Repository
public interface CaliberRepository extends CrudRepository<Caliber, Integer>{
}
