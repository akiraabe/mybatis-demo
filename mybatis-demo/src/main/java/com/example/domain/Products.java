package com.example.domain;

//import lombok.Data;
//@Data
public class Products {
	private Integer id;
	private String name;
	private Integer unitPrice;

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
	public Integer getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + "]";
	}
	
	
}
