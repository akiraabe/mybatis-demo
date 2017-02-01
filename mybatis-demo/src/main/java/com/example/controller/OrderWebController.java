package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.Order;
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
	public String index(Model model) {

		List<Order> orderList = service.findAll();
		orderList.forEach(System.out::println);
		model.addAttribute("orderList", orderList);
		return "order/list";
	}

	@RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
	public String getOrder(@PathVariable Integer id, Model model) {

		model.addAttribute("order", service.findOrderById(id));
		return "order/show";
	}
}
