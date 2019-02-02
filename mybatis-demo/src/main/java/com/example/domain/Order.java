package com.example.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Domain object for Order.
 * 
 * @author akiraabe
 *
 */
@Data
@ToString
public class Order implements Serializable {

	private static final long serialVersionUID = -7805714788906609372L;

	private Integer id;
	private Date orderDate;
	private Customer customers;
	private List<OrderDetail> orderDetails;

	/**
	 * sumUp grossAmount.
	 *
	 * <pre>
	 * sum(unitPrice * amount)
	 * </pre>
	 * 
	 * @return grossAmount
	 */
	public Integer sumUp() {
		Integer grossAmount = 0;
		for (OrderDetail detail : this.orderDetails) {
			grossAmount += (detail.getAmount() * detail.getProduct().getUnitPrice());
		}
		return grossAmount;
	}
}
