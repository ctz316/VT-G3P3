package com.skillstorm.project3.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    private int inventoryId;
    
    @OneToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouseId;
    
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product procuctId;
    
    @Column(name = "quantity")
    private int quantity;

    public Inventory() { }

	public Inventory(int inventoryId, Warehouse warehouseId, Product procuctId, int quantity) {
		super();
		this.inventoryId = inventoryId;
		this.warehouseId = warehouseId;
		this.procuctId = procuctId;
		this.quantity = quantity;
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Warehouse getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Warehouse warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Product getProcuctId() {
		return procuctId;
	}

	public void setProcuctId(Product procuctId) {
		this.procuctId = procuctId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "WarehouseInventory [inventory=" + inventoryId + ", warehouseId=" + warehouseId + ", procuctId="
				+ procuctId + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(inventoryId, procuctId, quantity, warehouseId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inventory other = (Inventory) obj;
		return inventoryId == other.inventoryId && Objects.equals(procuctId, other.procuctId) && quantity == other.quantity
				&& Objects.equals(warehouseId, other.warehouseId);
	}
    
}
