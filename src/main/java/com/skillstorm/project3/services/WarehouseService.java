package com.skillstorm.project3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.project3.models.Warehouse;
import com.skillstorm.project3.repositories.WarehouseRepository;

@Service
public class WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepo;

    public Iterable<Warehouse> getAllWarehouses() {
        return warehouseRepo.findAll();
    }

}
