package com.skillstorm.project3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.project3.models.Inventory;
import com.skillstorm.project3.services.InventoryService;

@RestController
@RequestMapping("/inv")
@CrossOrigin(origins = "*")
public class InventoryController {
		
	@Autowired 
	private InventoryService invServ;
	
	@GetMapping("/wh/{whId}")
	public Iterable<Inventory> getInvByWarehouseId(@PathVariable int whId) {
		Iterable<Inventory> temp = invServ.getInvByWarehouseId(whId);
		return temp;
	}
	
	@GetMapping("/all")
	public Iterable<Inventory> getAllInv() {
		return invServ.getAllInventory();
	}
	
	@GetMapping("/{invId}")
	public Inventory getInvById(@PathVariable int invId) {
		return invServ.getInventoryById(invId);
	}
	
	@PostMapping("/upd")
	public ResponseEntity<Inventory> addInvToWarehouse(@RequestBody Inventory inv,
			  										   @RequestParam(name = "updateModifier", required = false) String updateModifier) {
		if (!invServ.checkInventoryExistsById(inv.getInventoryId())) {
			Inventory temp = invServ.adjustWarehouseInv(inv, updateModifier);
			if (temp != null) {
				return ResponseEntity.status(HttpStatus.CREATED).body(temp);
			}
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(inv);
	}
	
	@DeleteMapping("/del/{id}")
	public ResponseEntity<Inventory> deleteUser(@PathVariable int id) {
		if (invServ.deleteById(id)) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
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
