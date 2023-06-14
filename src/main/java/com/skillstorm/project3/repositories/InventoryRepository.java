package com.skillstorm.project3.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.project3.models.Inventory;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Integer>{
	
	@Query(value = "SELECT * FROM inventory WHERE warehouse_id = :whId", nativeQuery = true)
	// declare your method; this is an interface , so we don't include implementation
	public Iterable<Inventory> findByWarehouseId(int whId);
}
