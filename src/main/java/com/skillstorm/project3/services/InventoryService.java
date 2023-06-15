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

	@Autowired
	private WarehouseService whServ;

	public Iterable<Inventory> getAllInventory() {
		return invRepo.findAll();
	}

//	public Inventory getInventoryById(int invId) {
//		if (checkInventoryExistsById(invId)) {
//			return invRepo.findById(invId).get();
//		} else {
//			return null;
//		}
//	}
	
	public Inventory getInventoryById(int id) {
		if (checkInventoryExistsById(id)) {
			return invRepo.findById(id).get();
		} else {
			return null;
		}
	}

	public Inventory getWarehouseInvByProduct(Warehouse warehouse, Product product) {
		return invRepo.findWarehouseInvByProductId(warehouse.getWarehouseId(), product.getProductId());
	}

	public boolean checkInventoryExistsById(int id) {
		return invRepo.existsById(id);
	}
	
	public boolean checkInventoryExistsInWhByProd(Warehouse warehouse, Product product) {
		return invRepo.existsByWarehouseIdAndProductId(warehouse, product);
	}

	public Iterable<Inventory> getInvByWarehouseId(int whId) {
		if (whServ.checkWarehouseExists(whId)) {
			return invRepo.findByWarehouseId(whServ.getWarehouseById(whId));
		}

		return null;
	}

	public Iterable<Inventory> getInvByProductId(int productId) {
		return invRepo.findByProductId(new Product(productId));
	}

	public Inventory adjustWarehouseInv(Inventory inv, String updateModifier) {
		if (inv == null) {
			return null;
		}

		Inventory temp = getWarehouseInvByProduct(inv.getWarehouseId(), inv.getProductId());

		if (!checkInventoryExistsById(inv.getInventoryId()) && temp == null) {
			return invRepo.save(inv);
		} else if (temp != null && updateModifier != null) {
			switch(updateModifier) {
				case "add":
					temp.addQuantity(inv.getQuantity());
				case "substract":
					temp.addQuantity(-inv.getQuantity());
				case "update":
					temp.setQuantity(inv.getQuantity());
			}
			
			return invRepo.save(temp);
		} else {
			return null;
		}
	}
	
	public boolean deleteById(int id) {
		if (checkInventoryExistsById(id)) {
			invRepo.deleteById(id);
			return !checkInventoryExistsById(id);
		} else {
			return checkInventoryExistsById(id);
		}
	}

}
