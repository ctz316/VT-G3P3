
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
		return "Size [sizeId=" + sizeId + ", sizeName=" + sizeName + "]";
	}
	
}
