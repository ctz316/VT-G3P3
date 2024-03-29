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
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.project3.models.Warehouse;
import com.skillstorm.project3.services.WarehouseService;

@RestController
@RequestMapping("/warehouse")
@CrossOrigin(origins = "*")
public class WarehouseController {

    @Autowired
    private WarehouseService whService;

    @GetMapping("/all")
    public Iterable<Warehouse> getAllWarehouses() {
        return whService.getAllWarehouses();
    }
    
    @GetMapping("/{id}")
    public Warehouse getWarehouseById(@PathVariable int id) {
    	return whService.getWarehouseById(id);
    }
    
    @PostMapping("/new")
    public ResponseEntity<Warehouse> addWarehouse(@RequestBody Warehouse warehouse) {
    	if(!whService.checkWarehouseExists(warehouse.getWarehouseId())) {
    		Warehouse temp = whService.addWarehouse(warehouse);
    		if(temp != null) {
    			return ResponseEntity.status(HttpStatus.CREATED).body(temp);
			}
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(warehouse);
    }
    
    @DeleteMapping("/del/{id}")
    public ResponseEntity<Warehouse> deleteWarehouse(@PathVariable int id) {
		if (whService.deleteWarehouseById(id)) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
    
    @PutMapping("/upd")
	public ResponseEntity<Warehouse> updateWarehouse(@RequestBody Warehouse warehouse) {
		if(warehouse != null && whService.checkWarehouseExists(warehouse.getWarehouseId())) {
			return ResponseEntity.status(HttpStatus.OK).body(whService.updateWarehouse(warehouse));
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}
	
}