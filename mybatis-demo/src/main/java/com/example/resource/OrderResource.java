package com.example.resource;

import java.util.ArrayList;
import java.util.List;

import com.example.domain.OrderDetail;
import com.example.domain.Order;

public class OrderResource {

	private Integer id;
	private String orderDate;
	private Integer grossAmount;
	private String customerName;
	private String address;
	private String phone;
	private List<OrderDetailResource> orderDetailResources;

	public OrderResource() {}
	public OrderResource(Order order) {
		setId(order.getId());
		setOrderDate(order.getOrderDate().toString()); //TODO
		setGrossAmount(order.sumUp());
		setCustomerName(order.getCustomers().getName());
		setAddress(order.getCustomers().getAddress());
		setPhone(order.getCustomers().getPhone());
		List<OrderDetailResource> orderDetailResources = new ArrayList<>();
		for (OrderDetail detail : order.getOrderDetails()) {
			OrderDetailResource orderDetailResource = new OrderDetailResource();
			orderDetailResource.setId(detail.getId());
			orderDetailResource.setProductName(detail.getProducts().getName());
			orderDetailResource.setProductAmount(detail.getAmount());
			orderDetailResource.setUnitPrice(detail.getProducts().getUnitPrice());
			orderDetailResources.add(orderDetailResource);
		}
		setOrderDetailResources(orderDetailResources);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(Integer grossAmount) {
		this.grossAmount = grossAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public List<OrderDetailResource> getOrderDetailResources() {
		return orderDetailResources;
	}

	public void setOrderDetailResources(List<OrderDetailResource> orderDetailResources) {
		this.orderDetailResources = orderDetailResources;

	}

}
