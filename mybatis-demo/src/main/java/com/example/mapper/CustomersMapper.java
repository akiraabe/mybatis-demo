package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.example.domain.Customers;

@Mapper
public interface CustomersMapper {
	
//	@Insert("INSERT INTO customers (name, address, phone) VALUES (#{name}, #{address}, #{phone})")
//	@Options(useGeneratedKeys = true)
	void insert(Customers customers);
	
//	@Select("SELECT id, name, address, phone FROM customers WHERE id = #{id}")
	Customers select(Integer id);
	
//	@Select("SELECT id, name, address, phone FROM customers")
	List<Customers> findAll();

}
