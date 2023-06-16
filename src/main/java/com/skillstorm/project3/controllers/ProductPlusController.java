package com.skillstorm.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.project3.models.Caliber;
import com.skillstorm.project3.models.Category;
import com.skillstorm.project3.models.Product;
import com.skillstorm.project3.models.Size;
import com.skillstorm.project3.repositories.CategoryRepository;
import com.skillstorm.project3.services.CaliberService;
import com.skillstorm.project3.services.ProductService;
import com.skillstorm.project3.services.SizeService;

@RestController
@RequestMapping("/p")
public class ProductPlusController {
	
	@Autowired
	ProductService prodServ;
	
	@Autowired
	CaliberService caliberServ;
	
	@Autowired
	SizeService sizeServ;
	
	@Autowired
	CategoryRepository catRepo;
	
	@GetMapping("/all")
	public Iterable<Product> getAllProducts() {
		return prodServ.getAllProducts();
	}
	
	@GetMapping("/cals/all")
	public Iterable<Caliber> getAllCalibers() {
		return caliberServ.getAllCalibers();
	}
	
	@GetMapping("/sizes/all")
	public Iterable<Size> getAllSizes() {
		return sizeServ.getAllSizes();
	}
	
	@GetMapping("/cats/all")
	public Iterable<Category> getAllCategories() {
		return catRepo.findAll();
	}
}
