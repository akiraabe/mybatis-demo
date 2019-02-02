package com.example.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Domain object for Customer.
 * 
 * @author akiraabe
 *
 */
@Data
@ToString
public class Customer implements Serializable {

	private static final long serialVersionUID = -259798521801118578L;
	
	private Integer id;
	private String name;
	private String address;
	private String phone;

}
