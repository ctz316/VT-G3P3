package com.skillstorm.project3.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int productId;
	
	@Column(name = "name")
	private String name;
	
	@OneToOne
	@JoinColumn(name = "category_id")
	private Category categoryId;
	
	@OneToOne
	@JoinColumn(name = "manufacturer_id")
	private Manufacturer manufacturerId;
	
	@OneToOne
	@JoinColumn(name = "size_id")
	private Size sizeId;
	
	@OneToOne
	@JoinColumn(name = "caliber_id")
	private Caliber caliberId;
	
	@Column(name = "product_desc")
	private String productDesc;
	
	@Column(name = "available")
	private int available;
	
	@Column(name = "image_url")
	private String imageURL;
	
	@Column(name = "alt_text")
	private String altText;
	
	public Product() { }
	
	public Product(int productId) {
		this.productId = productId;
	}

	public Product(int productId, String name, Category categoryId, Manufacturer manufacturerId, Size sizeId,
			Caliber caliberId, String productDesc, int available, String imageURL, String altText) {
		super();
		this.productId = productId;
		this.name = name;
		this.categoryId = categoryId;
		this.manufacturerId = manufacturerId;
		this.sizeId = sizeId;
		this.caliberId = caliberId;
		this.productDesc = productDesc;
		this.available = available;
		this.imageURL = imageURL;
		this.altText = altText;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

	public Manufacturer getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Manufacturer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public Size getSizeId() {
		return sizeId;
	}

	public void setSizeId(Size sizeId) {
		this.sizeId = sizeId;
	}

	public Caliber getCaliberId() {
		return caliberId;
	}

	public void setCaliberId(Caliber caliberId) {
		this.caliberId = caliberId;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getAltText() {
		return altText;
	}

	public void setAltText(String altText) {
		this.altText = altText;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", categoryId=" + categoryId + ", manufacturerId="
				+ manufacturerId + ", sizeId=" + sizeId + ", caliberId=" + caliberId + ", productDesc=" + productDesc
				+ ", available=" + available + ", imageURL=" + imageURL + ", altText=" + altText + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(altText, available, caliberId, categoryId, imageURL, manufacturerId, name, productDesc,
				productId, sizeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(altText, other.altText) && available == other.available
				&& Objects.equals(caliberId, other.caliberId) && Objects.equals(categoryId, other.categoryId)
				&& Objects.equals(imageURL, other.imageURL) && Objects.equals(manufacturerId, other.manufacturerId)
				&& Objects.equals(name, other.name) && Objects.equals(productDesc, other.productDesc)
				&& productId == other.productId && Objects.equals(sizeId, other.sizeId);
	}
	
	
}
