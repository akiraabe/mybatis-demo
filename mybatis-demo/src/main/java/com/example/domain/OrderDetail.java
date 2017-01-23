package com.example.domain;

public class OrderDetail {
	
	private Integer id;
	private Product product;
	private Integer amount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Product getProducts() {
		return product;
	}
	public void setProducts(Product product) {
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
		return "OrderDetail [id=" + id + ", product=" + product + ", amount=" + amount + "]";
	}
}
