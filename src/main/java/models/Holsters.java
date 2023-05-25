package models;

import javax.persistence.*;

@Entity
@Table(name = "holsters")
public class Holsters {
	
    // Variables
    @Id
    @Column(name = "holster_id")
    private int holsterId;
    @Column(name = "type")
    private String type;
    @Column(name = "size_id")
    private int sizeId;
    
    // Constructors
    public Holsters() {}
    public Holsters(int holsterId, String type, int sizeId) {
        this.holsterId = holsterId;
        this.type = type;
        this.sizeId = sizeId;
    }
    
    // To String method
    @Override
    public String toString() {
        return "Holsters{" +
                "holsterId=" + holsterId +
                ", type='" + type + '\'' +
                ", sizeId=" + sizeId +
                '}';
    }
    
    // Getters and Setters
    public int getHolsterId() {
        return holsterId;
    }
    public void setHolsterId(int holsterId) {
        this.holsterId = holsterId;
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
