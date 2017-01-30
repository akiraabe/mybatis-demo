package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.resource.OrderResource;
import com.example.service.OrderService;

/**
 * 
 * WebController class for Order.
 * 
 * @author akiraabe
 *
 */
@Controller
@RequestMapping("order")
public class OrderWebController {
	
	@Autowired
	OrderService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "order/input";
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public String getOrder(@PathVariable Integer id, Model model) {
		model.addAttribute("order", service.findOrderById(id));
		return "order/show";
	}
}
