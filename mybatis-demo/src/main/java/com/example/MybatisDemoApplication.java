package com.example;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Products;
import com.example.mapper.ProductsMapper;

@SpringBootApplication
public class MybatisDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MybatisDemoApplication.class, args);
	}
	
	private final ProductsMapper productsMapper;
	
	public MybatisDemoApplication(ProductsMapper productsMapper) {
		this.productsMapper = productsMapper;
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
		
		Products retrievalData = productsMapper.select(products.getId());
		System.out.println(retrievalData);
		System.out.println("----");
		
		List<Products> productsList = productsMapper.findAll();
		productsList.forEach(System.out::println);
	}
}
