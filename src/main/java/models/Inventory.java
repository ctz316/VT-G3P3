package models;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {

    // Variables
    @Id
    @Column(name = "inventory_id")
    private int inventory;
    @Column(name = "warehouse_id")
    private int warehouseId;
    @Column(name = "glock_id")
    private int glockId;
    @Column(name = "ammo_id")
    private int ammoId;
    @Column(name = "holster_id")
    private int holsterId;

    // Constructors
    public Inventory() {}
    public Inventory(int inventory, int warehouseId, int glockId, int ammoId, int holsterId) {
        this.inventory = inventory;
        this.warehouseId = warehouseId;
        this.glockId = glockId;
        this.ammoId = ammoId;
        this.holsterId = holsterId;
    }

    // To String method
    @Override
    public String toString() {
        return "Inventory{" +
                "inventory=" + inventory +
                ", warehouseId=" + warehouseId +
                ", glockId=" + glockId +
                ", ammoId=" + ammoId +
                ", holsterId=" + holsterId +
                '}';
    }

    // Getters and Setters
    public int getInventory() {
        return inventory;
    }
    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
    public int getWarehouseId() {
        return warehouseId;
    }
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
    public int getGlockId() {
        return glockId;
    }
    public void setGlockId(int glockId) {
        this.glockId = glockId;
    }
    public int getAmmoId() {
        return ammoId;
    }
    public void setAmmoId(int ammoId) {
        this.ammoId = ammoId;
    }
    public int getHolsterId() {
        return holsterId;
    }
    public void setHolsterId(int holsterId) {
        this.holsterId = holsterId;
    }
}
