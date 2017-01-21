package com.example.domain;

import java.util.List;

public class Orders {
	
	private Integer id;
	private Customers customer;
	private List<OrderDetails> orderDetails;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", customer=" + customer + ", orderDetails=" + orderDetails + "]";
	}
}
