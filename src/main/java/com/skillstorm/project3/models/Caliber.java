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
    private int caliberID;
    
    @Column(name = "caliber_name")
    private String caliberName;

    public Caliber() {}
    public Caliber(int caliberID, String caliberName) {
        this.caliberID = caliberID;
        this.caliberName = caliberName;
    }

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
    
	@Override
	public String toString() {
		return "Caliber [caliberID=" + caliberID + ", caliberName=" + caliberName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(caliberID, caliberName);
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
		return caliberID == other.caliberID && Objects.equals(caliberName, other.caliberName);
	}

	
    
}
