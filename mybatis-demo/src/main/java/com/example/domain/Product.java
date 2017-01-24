package com.example.domain;

import java.io.Serializable;

/**
 * Domain object for Product.
 * 
 * @author akiraabe
 *
 */
public class Product implements Serializable {

	private static final long serialVersionUID = 2576136325593691954L;

	private Integer id;
	private String name;
	private Integer unitPrice;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + "]";
	}

}
