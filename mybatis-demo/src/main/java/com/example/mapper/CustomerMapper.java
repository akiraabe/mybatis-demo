package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Customer;

@Mapper
public interface CustomerMapper {
	
	void insert(Customer customers);
	
	Customer select(Integer id);
	
	List<Customer> findAll();

}
