package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Orders;
import com.example.mapper.OrdersMapper;

@Service
public class OrdersService {
	
	@Autowired
	OrdersMapper ordersMapper;
	
	public Orders findOrdersById(Integer id) {
		return ordersMapper.selectOrder(id);
	}

}
