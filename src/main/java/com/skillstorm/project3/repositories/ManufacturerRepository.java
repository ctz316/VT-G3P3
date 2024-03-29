package com.skillstorm.project3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.project3.models.Manufacturer;


@Repository
public interface ManufacturerRepository extends CrudRepository<Manufacturer, Integer>{
}
