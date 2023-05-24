package models;

import javax.persistence.*;

@Entity
@Table(name = "calibers")
public class Calibers {

    // Variables
    @Id
    @Column(name = "caliber_id")
    private int caliberID;
    @Column(name = "caliber_name")
    private String cliberName;

    // Constructors
    public Calibers() {}
    public Calibers(int caliberID, String cliberName) {
        this.caliberID = caliberID;
        this.cliberName = cliberName;
    }

    // To String method
    @Override
    public String toString() {
        return "Calibers{" +
                "caliberID=" + caliberID +
                ", cliberName='" + cliberName + '\'' +
                '}';
    }

    // Getters and Setters
    public int getCaliberID() {
        return caliberID;
    }
    public void setCaliberID(int caliberID) {
        this.caliberID = caliberID;
    }
    public String getCliberName() {
        return cliberName;
    }
    public void setCliberName(String cliberName) {
        this.cliberName = cliberName;
    }
}
