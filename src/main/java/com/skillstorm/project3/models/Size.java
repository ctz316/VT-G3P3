package com.skillstorm.project3.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "size")
public class Size {

    @Id
    @Column(name = "size_id")
    private int sizeId;
    
    @Column(name = "size_name")
    private String sizeName;

    public Size() {}
    public Size(int sizeId, String sizeName) {
        this.sizeId = sizeId;
        this.sizeName = sizeName;
    }

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
    
    @Override
    public String toString() {
        return "Sizes{" +
                "sizeId=" + sizeId +
                ", sizeName='" + sizeName + '\'' +
                '}';
    }
	@Override
	public int hashCode() {
		return Objects.hash(sizeId, sizeName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Size other = (Size) obj;
		return sizeId == other.sizeId && Objects.equals(sizeName, other.sizeName);
	}
    
    
}
