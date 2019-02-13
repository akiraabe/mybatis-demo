package com.example.service;

import com.example.domain.Product;
import com.example.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductMapper productMapper;

    public void create(Product product) {
        productMapper.insert(product);
    }

    public List<Product> findAll() {
        return productMapper.findAll();
    }

    public Object findProductById(Integer id) {
        //TODO
        return null;
    }
}
