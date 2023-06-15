package com.skillstorm.project3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.project3.models.Inventory;
import com.skillstorm.project3.models.Product;
import com.skillstorm.project3.models.Warehouse;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Integer>{
	
	public Iterable<Inventory> findByWarehouseId(Warehouse warehouseId);

	public Iterable<Inventory> findByProductId(Product product);
}
