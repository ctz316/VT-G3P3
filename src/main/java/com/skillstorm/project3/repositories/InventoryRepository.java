package com.skillstorm.project3.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.project3.models.Inventory;
import com.skillstorm.project3.models.Product;
import com.skillstorm.project3.models.Warehouse;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Integer>{
	
	public Iterable<Inventory> findByWarehouseId(Warehouse warehouseId);

	public Iterable<Inventory> findByProductId(Product product);
	
	@Query(value = "SELECT * FROM inventory WHERE warehouse_id = :warehouseId AND product_id = :productId", nativeQuery = true)
	public Inventory findWarehouseInvByProductId(int warehouseId, int productId);
	
	
//	public Inventory findByInventoryId(int inventoryId);
	
	public boolean existsByWarehouseIdAndProductId(Warehouse warehouseId, Product productId);
//	@Query(value = "SELECT CASE WHEN COUNT(i) > 0 THEN true ELSE false END FROM inventory i WHERE i.warehouse_id = :warehouseId AND i.product_id = :productId")
//	public boolean existsByWarehouseInvByProductId(int warehouseId, int productId);
}
