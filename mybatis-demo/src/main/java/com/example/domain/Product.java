package com.example.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Domain object for Product.
 * 
 * @author akiraabe
 *
 */
@Data
@ToString
public class Product implements Serializable {

	private static final long serialVersionUID = 2576136325593691954L;

	private Integer id;
	private String name;
	private Integer unitPrice;

}
