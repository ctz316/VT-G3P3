package models;

import javax.persistence.*;

@Entity
@Table(name = "glocks")
public class Glocks {

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
    private int cliberId;

    // Constructors
    public Glocks() {}
    public Glocks(int glockId, String model, int sizeId, int cliberId) {
        this.glockId = glockId;
        this.model = model;
        this.sizeId = sizeId;
        this.cliberId = cliberId;
    }

    // To String method
    @Override
    public String toString() {
        return "Glocks{" +
                "glockId=" + glockId +
                ", model='" + model + '\'' +
                ", sizeId=" + sizeId +
                ", cliberId=" + cliberId +
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
    public int getCliberId() {
        return cliberId;
    }
    public void setCliberId(int cliberId) {
        this.cliberId = cliberId;
    }
}
