package com.example.domain;

import java.util.Date;
import java.util.List;

public class Order {

	private Integer id;
	private Date orderDate;
	private Customer customers;
	private List<OrderDetail> orderDetail;

	/**
	 * sumUp grossAmount. sum(unitPrice * amount)
	 * 
	 * @return grossAmount
	 */
	public Integer sumUp() {
		Integer grossAmount = 0;
		for (OrderDetail detail : this.orderDetail) {
			grossAmount += (detail.getAmount() * detail.getProducts().getUnitPrice());
		}
		return grossAmount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomers() {
		return customers;
	}

	public void setCustomers(Customer customers) {
		this.customers = customers;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetail;
	}

	public void setOrderDetails(List<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + ", customer=" + customers + ", orderDetail="
				+ orderDetail + "]";
	}
}
