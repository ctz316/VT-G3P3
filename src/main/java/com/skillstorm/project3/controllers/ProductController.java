package com.skillstorm.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.project3.models.Warehouse;
import com.skillstorm.project3.services.AmmunitionService;
import com.skillstorm.project3.services.CaliberService;
import com.skillstorm.project3.services.GlockService;
import com.skillstorm.project3.services.HolsterService;
import com.skillstorm.project3.services.InventoryService;
import com.skillstorm.project3.services.SizeService;
import com.skillstorm.project3.services.WarehouseService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {
		
	@Autowired
	AmmunitionService ammoServ;
	
	@Autowired
	CaliberService calServ;
	
	@Autowired
	GlockService glockServ;
	
	@Autowired
	HolsterService holsterServ;
	
	@Autowired
	InventoryService invServ;
	
	@Autowired
	SizeService sizeServ;
	
	@Autowired
	WarehouseService wareHouseServ;
	
//	@GetMapping("/{id}")
//	public Warehouse getUser(@PathVariable int id) {
//		return wareHouseServ.getUser(id);
//	}
//	
//	@GetMapping("/all")
//	public Iterable<User> getAllUsers() {
//		return wareHouseServ.getAllUsers();
//	}
}
