package com.skillstorm.project3.models;

import javax.persistence.*;

@Entity
@Table(name = "ammunition")
public class Ammunition {

    // Variables
    @Id
    @Column(name = "ammo_id")
    private int ammoId;
    @Column(name = "type")
    private String type;
    @Column(name = "size_id")
    private int sizeId;

    // Constructors
    public Ammunition() {}
    public Ammunition(int ammoId, String type, int sizeId) {
        this.ammoId = ammoId;
        this.type = type;
        this.sizeId = sizeId;
    }

    // To String method
    @Override
    public String toString() {
        return "Ammunition{" +
                "ammoId=" + ammoId +
                ", type='" + type + '\'' +
                ", sizeId=" + sizeId +
                '}';
    }

    // Getters and Setters
    public int getAmmoId() {
        return ammoId;
    }
    public void setAmmoId(int ammoId) {
        this.ammoId = ammoId;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getSizeId() {
        return sizeId;
    }
    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }
}
