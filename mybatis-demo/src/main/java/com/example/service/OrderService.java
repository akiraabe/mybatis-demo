package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Order;
import com.example.mapper.OrderMapper;
import com.example.resource.OrderResource;

/**
 * 
 * Service class for Order.
 * 
 * @author akiraabe
 *
 */
@Service
public class OrderService {
	
	@Autowired
	OrderMapper orderMapper;
	
	/**
	 * find Order by Id column.
	 * @param id
	 * @return Order resource object.
	 */
	public OrderResource findOrderById(Integer id) {
		Order order =  orderMapper.selectOrder(id);
		OrderResource resource = new OrderResource(order);
		
		return resource;
	}

}
