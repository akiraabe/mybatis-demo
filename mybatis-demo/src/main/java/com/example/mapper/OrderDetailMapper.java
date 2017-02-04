package com.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import com.example.domain.OrderDetail;

@Mapper
public interface OrderDetailMapper {

	@Insert("INSERT INTO order_details (orders_id, products_id, amount) VALUES (#{orderId}, #{product.id}, #{amount})")
	@Options(useGeneratedKeys = true)
	void insert(OrderDetail orderDetail);

}
