package com.example;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Customers;
import com.example.domain.Orders;
import com.example.domain.Products;
import com.example.mapper.CustomersMapper;
import com.example.mapper.OrdersMapper;
import com.example.mapper.ProductsMapper;

@SpringBootApplication
public class MybatisDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MybatisDemoApplication.class, args);
	}
	
	private final ProductsMapper productsMapper;
	private final CustomersMapper customersMapper;
	private final OrdersMapper ordersMapper;
	
	public MybatisDemoApplication(ProductsMapper productsMapper,
			CustomersMapper customersMapper,
			OrdersMapper ordersMapper) {
		this.productsMapper = productsMapper;
		this.customersMapper = customersMapper;
		this.ordersMapper = ordersMapper;
	}
	
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		Products products = new Products();
		products.setName("ラケット");
		products.setUnitPrice(5000);
		
		Products ball = new Products();
		ball.setName("ボール");
		ball.setUnitPrice(200);
		
		Products shoes = new Products();
		shoes.setName("シューズ");
		shoes.setUnitPrice(8000);
		
		productsMapper.insert(products);
		productsMapper.insert(ball);
		productsMapper.insert(shoes);
		
		// customers
		Customers akira = new Customers();
		akira.setName("Akira Abe");
		akira.setAddress("Chiba");
		akira.setPhone("0120-999-999");
		customersMapper.insert(akira);
		
		// -- select --
		Products retrievalData = productsMapper.select(products.getId());
		System.out.println(retrievalData);
		System.out.println("----");
		
		List<Products> productsList = productsMapper.findAll();
		productsList.forEach(System.out::println);
		
		List<Customers> customersList = customersMapper.findAll();
		customersList.forEach(System.out::println);
		
		System.out.println("----");
		Orders order = ordersMapper.selectOrder(1);
		System.out.println(order);
		System.out.println("grossAmount : " + order.sumUp());
		
	}
}
