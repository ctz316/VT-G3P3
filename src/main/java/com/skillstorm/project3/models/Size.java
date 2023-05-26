package com.skillstorm.project3.models;

import javax.persistence.*;

@Entity
@Table(name = "size")
public class Size {

    // Variables
    @Id
    @Column(name = "size_id")
    private int sizeId;
    @Column(name = "size_name")
    private String sizeName;

    // Constructors
    public Size() {}
    public Size(int sizeId, String sizeName) {
        this.sizeId = sizeId;
        this.sizeName = sizeName;
    }

    // To String method
    @Override
    public String toString() {
        return "Sizes{" +
                "sizeId=" + sizeId +
                ", sizeName='" + sizeName + '\'' +
                '}';
    }

    // Getters and Setters
    public int getSizeId() {
        return sizeId;
    }
    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }
    public String getSizeName() {
        return sizeName;
    }
    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }
}
