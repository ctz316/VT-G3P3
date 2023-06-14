package com.skillstorm.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.project3.models.Warehouse;
import com.skillstorm.project3.repositories.WarehouseRepository;

@Service
public class WarehouseService {
	
	@Autowired
	private WarehouseRepository whRepo;
	
	public Warehouse getWarehouseById(int id) {
		if (checkWarehouseExists(id)) {
			return whRepo.findById(id).get();
		} else {
			return null;
		}
	}
	
	public boolean checkWarehouseExists(int id) {
		return whRepo.existsById(id);
	}
	
	public Iterable<Warehouse> getAllWarehouses() {
		return whRepo.findAll();
	}
	
	public Warehouse addWarehouse(Warehouse warehouse) {
		if (checkWarehouseExists(warehouse.getWarehouseId())) {
			return null;
		} else {
			return whRepo.save(warehouse);
		}
	}
	
	public Warehouse updateWarehouse(Warehouse warehouse) {
		return whRepo.save(warehouse);
	}
	
	public boolean deleteById(int id) {
		if (checkWarehouseExists(id)) {
			whRepo.deleteById(id);
			return !checkWarehouseExists(id);
		} else {
			return checkWarehouseExists(id);
		}
	}
	
}
