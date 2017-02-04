package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Order;
import com.example.domain.OrderDetail;
import com.example.mapper.OrderDetailMapper;
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

	@Autowired
	OrderDetailMapper orderDetailMapper;

	/**
	 * find Order by Id column.
	 * 
	 * @param id
	 * @return Order resource object.
	 */
	public OrderResource findOrderById(Integer id) {
		Order order = orderMapper.selectOrder(id);
		OrderResource resource = new OrderResource(order);

		return resource;
	}

	public List<Order> findAll() {
		return orderMapper.findAll();
	}

	public void create(Order order) {

		orderMapper.insert(order);
		System.out.println("order : " + order);

		for (OrderDetail orderDetail : order.getOrderDetails()) {
			orderDetail.setOrderId(order.getId());
			orderDetailMapper.insert(orderDetail);
		}
	}

}
