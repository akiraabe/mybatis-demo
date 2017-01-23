package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Orders;

@Mapper
public interface OrdersMapper {
	
	Orders selectOrder(Integer id);
	void insert(Orders orders);

}
