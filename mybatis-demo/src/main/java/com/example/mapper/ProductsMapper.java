package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.example.domain.Products;

@Mapper
public interface ProductsMapper {
	
	@Insert("INSERT INTO products (name, unitPrice) VALUES (#{name}, #{unitPrice})")
	@Options(useGeneratedKeys = true)
	void insert(Products products);
	
	@Select("SELECT id, name, unitPrice FROM products WHERE id = #{id}")
	Products select(Integer id);
	
	@Select("SELECT id, name, unitPrice FROM products")
	List<Products> findAll();

}
