package com.skillstorm.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.project3.models.Inventory;
import com.skillstorm.project3.repositories.InventoryRepository;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepo;

    public Iterable<Inventory> getAllInventory() {
        return inventoryRepo.findAll();
    }

}
