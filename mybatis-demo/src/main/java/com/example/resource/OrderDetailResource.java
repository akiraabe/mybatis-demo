package com.example.resource;

import lombok.Data;

@Data
public class OrderDetailResource {

	private Integer id;
	private String productName;
	private Integer productAmount;
	private Integer unitPrice;

}
