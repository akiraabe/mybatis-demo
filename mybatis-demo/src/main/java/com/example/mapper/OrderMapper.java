package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Order;

@Mapper
public interface OrderMapper {
	
	Order selectOrder(Integer id);
	void insert(Order order);
	List<Order> findAll();

}
