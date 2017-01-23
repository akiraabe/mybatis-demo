package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.OrderDTO;
import com.example.service.OrderService;

@RestController
@RequestMapping("orders")
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public OrderDTO getOrder(@PathVariable Integer id) {
		return service.findOrdersById(id);
	}
}
