package com.skillstorm.project3.models;

import javax.persistence.*;

@Entity
@Table(name = "caliber")
public class Caliber {

    // Variables
    @Id
    @Column(name = "caliber_id")
    private int caliberID;
    @Column(name = "caliber_name")
    private String caliberName;

    // Constructors
    public Caliber() {}
    public Caliber(int caliberID, String caliberName) {
        this.caliberID = caliberID;
        this.caliberName = caliberName;
    }

    // To String method
    @Override
    public String toString() {
        return "Calibers{" +
                "caliberID=" + caliberID +
                ", cliberName='" + caliberName + '\'' +
                '}';
    }

    // Getters and Setters
    public int getCaliberID() {
        return caliberID;
    }
    public void setCaliberID(int caliberID) {
        this.caliberID = caliberID;
    }
    public String getCaliberName() {
        return caliberName;
    }
    public void setCaliberName(String caliberName) {
        this.caliberName = caliberName;
    }
}
