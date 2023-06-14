package com.skillstorm.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.project3.repositories.CaliberRepository;
import com.skillstorm.project3.repositories.CategoryRepository;
import com.skillstorm.project3.repositories.ManufacturerRepository;
import com.skillstorm.project3.repositories.SizeRepository;

@Service
public class InfoManagementService {

	@Autowired
	CaliberRepository caliberRepo;
	
	@Autowired
	CategoryRepository catRepo;
	
	@Autowired
	ManufacturerRepository manufRepo;
	
	@Autowired
	SizeRepository sizeRepo;
	
	
	
	
}
