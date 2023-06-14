package com.skillstorm.project3.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "warehouse")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "warehouse_id")
    private int warehouseId;
    
    @Column(name = "capacity")
    private int warehouseName;
    
    @Column(name = "active")
    private int active;

    public Warehouse() {}
    
    public Warehouse(int warehouseId) {
    	this.warehouseId = warehouseId;
    }
    
    public Warehouse(int warehouseId, int warehouseName, int active) {
		super();
		this.warehouseId = warehouseId;
		this.warehouseName = warehouseName;
		this.active = active;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public int getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(int warehouseName) {
		this.warehouseName = warehouseName;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public int hashCode() {
		return Objects.hash(active, warehouseId, warehouseName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Warehouse other = (Warehouse) obj;
		return active == other.active && warehouseId == other.warehouseId && warehouseName == other.warehouseName;
	}

	@Override
	public String toString() {
		return "Warehouse [warehouseId=" + warehouseId + ", warehouseName=" + warehouseName + ", active=" + active
				+ "]";
	}


}
