package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.resource.OrderResource;
import com.example.service.OrderService;

/**
 * 
 * Controller class for Order.
 * 
 * @author akiraabe
 *
 */
@RestController
@RequestMapping("orders")
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public OrderResource getOrder(@PathVariable Integer id) {
		return service.findOrderById(id);
	}
}
