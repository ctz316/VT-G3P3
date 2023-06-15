package com.skillstorm.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.project3.models.Inventory;
import com.skillstorm.project3.services.InventoryService;
import com.skillstorm.project3.services.ProductService;

@RestController
@RequestMapping("/inv")
@CrossOrigin(origins = "*")
public class InventoryController {
		
	@Autowired 
	InventoryService invServ;
	
	@GetMapping("/wh/{whId}")
	public Iterable<Inventory> getInvByWarehouseId(@PathVariable int whId) {
		return invServ.getInvByWarehouseId(whId);
	}
	
	@GetMapping("/all")
	public Iterable<Inventory> getAllInv() {
		return invServ.getAllInventory();
	}
	
	@GetMapping("/{invId}")
	public Inventory getInvById(@PathVariable int invId) {
		return invServ.getInventoryById(invId);
	}
	
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
