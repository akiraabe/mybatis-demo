package com.example.controller;

import org.hibernate.validator.constraints.NotEmpty;

public class OrderCreateForm {

	@NotEmpty
	private String orderDate;

	private String customer;

	private String product1;

	private String orderAmount1;

	private String product2;

	private String orderAmount2;

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getProduct1() {
		return product1;
	}

	public void setProduct1(String product1) {
		this.product1 = product1;
	}

	public String getOrderAmount1() {
		return orderAmount1;
	}

	public void setOrderAmount1(String orderAmount1) {
		this.orderAmount1 = orderAmount1;
	}

	public String getProduct2() {
		return product2;
	}

	public void setProduct2(String product2) {
		this.product2 = product2;
	}

	public String getOrderAmount2() {
		return orderAmount2;
	}

	public void setOrderAmount2(String orderAmount2) {
		this.orderAmount2 = orderAmount2;
	}

}
