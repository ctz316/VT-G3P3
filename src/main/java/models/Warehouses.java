package models;

import javax.persistence.*;

@Entity
@Table(name = "warehouses")
public class Warehouses {

    // Variables
    @Id
    @Column(name = "warehouse_id")
    private int warehouseId;
    @Column(name = "warehouse_name")
    private String warehouseName;

    // Constructors
    public Warehouses() {}
    public Warehouses(int warehouseId, String warehouseName) {
        this.warehouseId = warehouseId;
        this.warehouseName = warehouseName;
    }

    // To String method

    @Override
    public String toString() {
        return "Warehouses{" +
                "warehouseId=" + warehouseId +
                ", warehouseName='" + warehouseName + '\'' +
                '}';
    }

    // Getters and Setters
    public int getWarehouseId() {
        return warehouseId;
    }
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
    public String getWarehouseName() {
        return warehouseName;
    }
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }
}
