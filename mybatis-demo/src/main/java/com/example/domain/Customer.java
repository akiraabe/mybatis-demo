package com.example.domain;

import java.io.Serializable;

/**
 * Domain object for Customer.
 * 
 * @author akiraabe
 *
 */
public class Customer implements Serializable {

	private static final long serialVersionUID = -259798521801118578L;
	
	private Integer id;
	private String name;
	private String address;
	private String phone;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
}
