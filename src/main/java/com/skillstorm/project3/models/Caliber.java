package com.skillstorm.project3.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "caliber")
public class Caliber {

    @Id
    @Column(name = "caliber_id")
    private int caliberId;
    
    @Column(name = "caliber_name")
    private String caliberName;

    public Caliber() {}
    public Caliber(int caliberID, String caliberName) {
        this.caliberId = caliberID;
        this.caliberName = caliberName;
    }

    public int getCaliberId() {
        return caliberId;
    }
    public void setCaliberId(int caliberID) {
        this.caliberId = caliberID;
    }
    public String getCaliberName() {
        return caliberName;
    }
    public void setCaliberName(String caliberName) {
        this.caliberName = caliberName;
    }
    
	@Override
	public String toString() {
		return "Caliber [caliberId=" + caliberId + ", caliberName=" + caliberName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(caliberId, caliberName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caliber other = (Caliber) obj;
		return caliberId == other.caliberId && Objects.equals(caliberName, other.caliberName);
	}

	
    
}
