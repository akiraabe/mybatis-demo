package com.example.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Domain object for OrderDetail.
 * 
 * @author akiraabe
 *
 */
@Data
@ToString
public class OrderDetail implements Serializable {

	private static final long serialVersionUID = -2242101628684039986L;

	private Integer id;
	private Integer orderId;
	private Product product;
	private Integer amount;
}
