package com.skillstorm.project3.models;

import javax.persistence.*;

@Entity
@Table(name = "glock")
public class Glock {

    // Variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "glock_id")
    private int glockId;
    @Column(name = "model")
    private String model;
    @Column(name = "size_id")
    private int sizeId;
    @Column(name = "cliber_id")
    private int caliberId;

    // Constructors
    public Glock() {}
    public Glock(int glockId, String model, int sizeId, int caliberId) {
        this.glockId = glockId;
        this.model = model;
        this.sizeId = sizeId;
        this.caliberId = caliberId;
    }

    // To String method
    @Override
    public String toString() {
        return "Glocks{" +
                "glockId=" + glockId +
                ", model='" + model + '\'' +
                ", sizeId=" + sizeId +
                ", cliberId=" + caliberId +
                '}';
    }

    // Getters and Setters
    public int getGlockId() {
        return glockId;
    }
    public void setGlockId(int glockId) {
        this.glockId = glockId;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getSizeId() {
        return sizeId;
    }
    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }
    public int getCaliberId() {
        return caliberId;
    }
    public void setCliberId(int caliberId) {
        this.caliberId = caliberId;
    }
}
