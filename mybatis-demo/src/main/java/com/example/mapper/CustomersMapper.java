package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Customers;

@Mapper
public interface CustomersMapper {
	
	void insert(Customers customers);
	
	Customers select(Integer id);
	
	List<Customers> findAll();

}
