package com.skillstorm.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.project3.models.Product;
import com.skillstorm.project3.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository prodRepo;
	
	public Iterable<Product> getAllProducts() {
		return prodRepo.findAll();
	}
}
