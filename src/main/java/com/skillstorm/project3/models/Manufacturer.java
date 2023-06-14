package com.skillstorm.project3.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "manufacturer_id")
	private int manufacturerId;
	
	@Column(name = "manufacturer_name")
	private String manufacturerName;
	
	public Manufacturer() { }

	public Manufacturer(int manufacturerId, String manufacturerName) {
		super();
		this.manufacturerId = manufacturerId;
		this.manufacturerName = manufacturerName;
	}

	public int getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	@Override
	public String toString() {
		return "Manufacturer [manufacturerId=" + manufacturerId + ", manufacturerName=" + manufacturerName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(manufacturerId, manufacturerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manufacturer other = (Manufacturer) obj;
		return manufacturerId == other.manufacturerId && Objects.equals(manufacturerName, other.manufacturerName);
	}
	
	

}
