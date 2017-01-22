package com.example.domain;

import java.sql.Date;
import java.util.List;

public class Orders {

	private Integer id;
	private Date orderDate;
	private Customers customer;
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
		return "Orders [id=" + id + ", orderDate=" + orderDate + ", customer=" + customer + ", orderDetails="
				+ orderDetails + "]";
	}
}
