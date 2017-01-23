package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Order;
import com.example.dto.OrderDTO;
import com.example.mapper.OrderMapper;

@Service
public class OrderService {
	
	@Autowired
	OrderMapper orderMapper;
	
	public OrderDTO findOrdersById(Integer id) {
		Order order =  orderMapper.selectOrder(id);
		OrderDTO dto = new OrderDTO(order);
		
		return dto;
	}

}
