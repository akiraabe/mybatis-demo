package com.example.domain;

public class OrderDetails {
	
	private Integer id;
	private Products product;
	private Integer amount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", product=" + product + ", amount=" + amount + "]";
	}
}
