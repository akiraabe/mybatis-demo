package com.example.controller;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@ToString
public class OrderCreateForm {

	@NotEmpty
	private String orderDate;

	private String customer;

	private String product1;

	private String orderAmount1;

	private String product2;

	private String orderAmount2;

}
