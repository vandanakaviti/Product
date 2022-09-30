package com.sts.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int prodId;
	private String prodCategory;
	private String prodName;
	private double prodPrice;
	
	public Product() {
		super();
	}
	
	public Product(int prodId, String prodCategory, String prodName, double prodPrice) {
		super();
		this.prodId = prodId;
		this.prodCategory = prodCategory;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCategory=" + prodCategory + ", prodName=" + prodName
				+ ", prodPrice=" + prodPrice + "]";
	}
}