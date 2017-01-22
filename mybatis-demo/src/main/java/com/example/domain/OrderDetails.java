package com.example.domain;

public class OrderDetails {
	
	private Integer id;
	private Products products;
	private Integer amount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", products=" + products + ", amount=" + amount + "]";
	}
}
