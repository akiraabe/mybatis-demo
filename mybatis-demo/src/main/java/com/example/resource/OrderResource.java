package com.example.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.domain.OrderDetail;
import com.example.domain.Order;

public class OrderDTO {

	private Integer id;
	private String orderDate;
	private Integer grossAmount;
	private String customerName;
	private String address;
	private String phone;
	private List<OrderDetailDTO> orderDetailDTOList;

	public OrderDTO() {}
	public OrderDTO(Order order) {
		setId(order.getId());
		setOrderDate(order.getOrderDate().toString());
		setGrossAmount(order.sumUp());
		setCustomerName(order.getCustomers().getName());
		setAddress(order.getCustomers().getAddress());
		setPhone(order.getCustomers().getPhone());
		List<OrderDetailDTO> orderDetailDTOList = new ArrayList<>();
		for (OrderDetail detail : order.getOrderDetails()) {
			OrderDetailDTO odDTO = new OrderDetailDTO();
			odDTO.setId(detail.getId());
			odDTO.setProductName(detail.getProducts().getName());
			odDTO.setProductAmount(detail.getAmount());
			odDTO.setUnitPrice(detail.getProducts().getUnitPrice());
			orderDetailDTOList.add(odDTO);
		}
		setOrderDetailDTOList(orderDetailDTOList);
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

	public List<OrderDetailDTO> getOrderDetailDTOList() {
		return orderDetailDTOList;
	}

	public void setOrderDetailDTOList(List<OrderDetailDTO> orderDetailDTOList) {
		this.orderDetailDTOList = orderDetailDTOList;
	}

}
