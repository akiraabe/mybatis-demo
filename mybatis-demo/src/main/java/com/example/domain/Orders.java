package com.example.domain;

import java.util.Date;
import java.util.List;

public class Orders {

	private Integer id;
	private Date orderDate;
	private Customers customers;
	private List<OrderDetails> orderDetails;

	/**
	 * sumUp grossAmount. sum(unitPrice * amount)
	 * 
	 * @return grossAmount
	 */
	public Integer sumUp() {
		Integer grossAmount = 0;
		for (OrderDetails detail : this.orderDetails) {
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

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", orderDate=" + orderDate + ", customer=" + customers + ", orderDetails="
				+ orderDetails + "]";
	}
}
