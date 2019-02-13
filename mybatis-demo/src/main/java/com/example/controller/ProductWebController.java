package com.example.controller;

import com.example.domain.Customer;
import com.example.domain.Order;
import com.example.domain.OrderDetail;
import com.example.domain.Product;
import com.example.mapper.CustomerMapper;
import com.example.mapper.ProductMapper;
import com.example.service.OrderService;
import com.example.service.ProductService;
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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * WebController class for Product.
 * 
 * @author akiraabe
 *
 */
@Controller
@RequestMapping("product")
public class ProductWebController {

	@Autowired
	ProductService service;

	@ModelAttribute
	Product setUpForm() {
		return new Product();
	}

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {

		List<Product> productList = service.findAll();
		productList.forEach(System.out::println);
		model.addAttribute("productList", productList);
		return "product/list";
	}

	@RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
	public String getOrder(@PathVariable Integer id, Model model) {

		model.addAttribute("order", service.findProductById(id));
		return "product/show";
	}

	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Model model) {

		return "product/input";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	String create(@Validated Product entity, BindingResult result, Model model, RedirectAttributes attributes) {

		// Validate
		if (result.hasErrors()) {
			return "product/input";
		}

		// Register.
		service.create(entity);

		return "redirect:";
	}
}
