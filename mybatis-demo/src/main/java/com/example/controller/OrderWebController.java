package com.example.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.Customer;
import com.example.domain.Order;
import com.example.domain.OrderDetail;
import com.example.mapper.CustomerMapper;
import com.example.mapper.ProductMapper;
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

	@Autowired
	CustomerMapper customerMapper;
	
	@Autowired
	ProductMapper productMapper;

	@ModelAttribute
	OrderCreateForm setUpForm() {
		return new OrderCreateForm();
	}

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

	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Model model) {

		model.addAttribute("customers", customerMapper.findAll());
		model.addAttribute("products", productMapper.findAll());
		return "order/input";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	String create(@Validated OrderCreateForm form, BindingResult result, Model model, RedirectAttributes attributes) {

		// Validate
		if (result.hasErrors()) {
			return "order/input";
		}

		// Register Order domain
		Order order = new Order();
		// System.out.println(form.getOrderDate());
		// System.out.println(form.getCustomer());
		// System.out.println(form.getProduct1());
		// System.out.println(form.getOrderAmount1());
		// System.out.println(form.getProduct2());
		// System.out.println(form.getOrderAmount2());

		// Create Domain object.
		Customer customer = customerMapper.select(Integer.parseInt(form.getCustomer()));
		List<OrderDetail> orderDetails = new ArrayList<>();
		OrderDetail od1 = new OrderDetail();
		od1.setProducts(productMapper.select(Integer.parseInt(form.getProduct1())));
		od1.setAmount(Integer.parseInt(form.getOrderAmount1()));
		OrderDetail od2 = new OrderDetail();
		od2.setProducts(productMapper.select(Integer.parseInt(form.getProduct2())));
		od2.setAmount(Integer.parseInt(form.getOrderAmount2()));
		orderDetails.add(od1);
		orderDetails.add(od2);
		
		order.setOrderDate(new Date()); // TODO
		order.setCustomers(customer);
		order.setOrderDetails(orderDetails);

		// Register order.
		service.create(order);

		return "redirect:";
	}
}
