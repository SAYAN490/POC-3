package com.blueconch.poc2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")

public class Product {
	@Id
	@Column(name="PROD_ID")
	Integer prod_id;
	
	@Column(name="PROD_NAME")
	String prod_name;
	
	@Column(name="PROD_IMAGE")
	String prod_image;
	
	@Column(name="PROD_ACTIVE")
	Integer prod_active;
	
	@Column(name="PROD_PRICE")
	Float prod_price;
	
	/*
	private int prod_id;
	private String prod_name;
	private String prod_image;
	private int prod_active;
	private float prod_price;
	
	public Product() {
		
	}
	
	public Product(int prod_id, String prod_name, String prod_image, int prod_active, float prod_price) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_image = prod_image;
		this.prod_active = prod_active;
		this.prod_price = prod_price;
	}*/
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_image() {
		return prod_image;
	}
	public void setProd_image(String prod_image) {
		this.prod_image = prod_image;
	}
	public int getProd_active() {
		return prod_active;
	}
	public void setProd_active(int prod_active) {
		this.prod_active = prod_active;
	}
	public float getProd_price() {
		return prod_price;
	}
	public void setProd_price(float prod_price) {
		this.prod_price = prod_price;
	}
	
	
	

}
