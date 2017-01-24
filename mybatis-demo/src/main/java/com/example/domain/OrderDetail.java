package com.example.domain;

import java.io.Serializable;

/**
 * Domain object for OrderDetail.
 * 
 * @author akiraabe
 *
 */
public class OrderDetail implements Serializable {

	private static final long serialVersionUID = -2242101628684039986L;

	private Integer id;
	private Product product;
	private Integer amount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Product getProducts() {
		return product;
	}

	public void setProducts(Product product) {
		this.product = product;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", product=" + product + ", amount=" + amount + "]";
	}
}
