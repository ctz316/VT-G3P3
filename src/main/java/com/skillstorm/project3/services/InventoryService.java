package com.skillstorm.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.project3.models.Inventory;
import com.skillstorm.project3.models.Product;
import com.skillstorm.project3.models.Warehouse;
import com.skillstorm.project3.repositories.InventoryRepository;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository invRepo;

    
    public Iterable<Inventory> getAllInventory() {
        return invRepo.findAll();
    }
    
//    public Inventory getInvById(int invId) {
//    	System.out.println(invRepo.findById(invId).get());
//    	return invRepo.findById(invId).get();
//    }
    
    public Inventory getInventoryById(int id) {
		if (checkInventoryExists(id)) {
			System.out.println(invRepo.findById(id).get());
			return invRepo.findById(id).get();
		} else {
			return null;
		}
	}
    
    private boolean checkInventoryExists(int id) {
    	return invRepo.existsById(id);
}

	public void addProdToWarehouseById(int whId, int pId, int qty) {
    		invRepo.save(new Inventory(0, new Warehouse(whId), new Product(pId), qty));
	}
    
    public Iterable<Inventory> getInvByWhId(int whId) {
    	return invRepo.findByWarehouseId(whId);
    }
}
