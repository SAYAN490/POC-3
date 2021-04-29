package com.blueconch.poc2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address {
	@Id
	
	@Column(name="ADD_ID")
	Integer add_id;
	
	@Column(name="Name")
	String name;
	
	@Column(name="ADD1")
	String add1;
	
	@Column(name="ADD2")
	String add2;
	
	@Column(name="CITY")
	String city;
	
	@Column(name="STATE")
	String state;
	
	@Column(name="ZIP")
	Integer zip;
	
	@Column(name="PHN")
	Integer phone;
	
	@Column(name="ACC_ID")
	Integer acc_id;
	
	/*private int add_id;
	private String name;
	private String add1;
	private String add2;
	private String city;
	private String state;
	private int phone;
	private int acc_id;*/
	
	
	
	/*public Address()
	{
		
	}
	
	public Address(int add_id, String name, String add1, String add2, String city, String state, int phone, int zip,
			int acc_id) {
		super();
		this.add_id = add_id;
		this.name = name;
		this.add1 = add1;
		this.add2 = add2;
		this.city = city;
		this.state = state;
		this.phone = phone;
		this.zip= zip;
		this.acc_id = acc_id;
	}*/

	public int getAdd_id() {
		return add_id;
	}

	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	
	
	
	
	
	

}
