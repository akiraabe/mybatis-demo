package com.example.resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.domain.OrderDetail;
import com.example.domain.Order;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderResource {

	private Integer id;
	private Date orderDate;
	private Integer grossAmount;
	private String customerName;
	private String address;
	private String phone;
	private List<OrderDetailResource> orderDetailResources;

	public OrderResource() {}
	public OrderResource(Order order) {
		setId(order.getId());
		setOrderDate(order.getOrderDate());
		setGrossAmount(order.sumUp());
		setCustomerName(order.getCustomers().getName());
		setAddress(order.getCustomers().getAddress());
		setPhone(order.getCustomers().getPhone());
		List<OrderDetailResource> orderDetailResources = new ArrayList<>();
		for (OrderDetail detail : order.getOrderDetails()) {
			OrderDetailResource orderDetailResource = new OrderDetailResource();
			orderDetailResource.setId(detail.getId());
			orderDetailResource.setProductName(detail.getProduct().getName());
			orderDetailResource.setProductAmount(detail.getAmount());
			orderDetailResource.setUnitPrice(detail.getProduct().getUnitPrice());
			orderDetailResources.add(orderDetailResource);
		}
		setOrderDetailResources(orderDetailResources);
	}
}
