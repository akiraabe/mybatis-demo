package com.example;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Customer;
import com.example.domain.Order;
import com.example.domain.Product;
import com.example.mapper.CustomerMapper;
import com.example.mapper.OrderMapper;
import com.example.mapper.ProductMapper;
import com.example.service.OrderService;

@SpringBootApplication
//public class MybatisDemoApplication implements CommandLineRunner {
public class MybatisDemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MybatisDemoApplication.class, args);
	}
	
//	private final ProductMapper productsMapper;
//	private final CustomerMapper customersMapper;
//	private final OrderMapper orderMapper;
//	
//	@Autowired
//	OrderService ordersService;
//	
//	public MybatisDemoApplication(ProductMapper productsMapper,
//			CustomerMapper customersMapper,
//			OrderMapper orderMapper) {
//		this.productsMapper = productsMapper;
//		this.customersMapper = customersMapper;
//		this.ordersMapper = orderMapper;
//	}
//	
//	@Transactional
//	@Override
//	public void run(String... args) throws Exception {
//		Product products = new Product();
//		products.setName("ラケット");
//		products.setUnitPrice(5000);
//		
//		Product ball = new Product();
//		ball.setName("ボール");
//		ball.setUnitPrice(200);
//		
//		Product shoes = new Product();
//		shoes.setName("シューズ");
//		shoes.setUnitPrice(8000);
//		
//		productsMapper.insert(products);
//		productsMapper.insert(ball);
//		productsMapper.insert(shoes);
//		
//		// customers
//		Customer akira = new Customer();
//		akira.setName("Akira Abe");
//		akira.setAddress("Chiba");
//		akira.setPhone("0120-999-999");
//		customersMapper.insert(akira);
//		
//		// orders
//		Order orders = new Order();
//		orders.setCustomers(akira);
//		orders.setOrderDate(new Date());
//		orderMapper.insert(orders);
//		
//		// -- select --
//		Product retrievalData = productsMapper.select(products.getId());
//		System.out.println(retrievalData);
//		System.out.println("----");
//		
//		List<Product> productsList = productsMapper.findAll();
//		productsList.forEach(System.out::println);
//		
//		List<Customer> customersList = customersMapper.findAll();
//		customersList.forEach(System.out::println);
//		
//		System.out.println("----");
//		//Order order = orderMapper.selectOrder(1);
//		Order order = ordersService.findOrdersById(1);
//		System.out.println(order);
//		System.out.println("grossAmount : " + order.sumUp());
//		
//	}
}
