package com.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Exceptions.NoProductsException;
import com.product.dao.ProductDao;
import com.product.models.Product;

@Service
public class ProductServices {
	@Autowired
	private ProductDao dao;
	
	public List<Product> getProducts(){
	
		List<Product> list=dao.findAll();
		if(list.isEmpty()) {
			throw new NoProductsException("No Products found");
		}
		else return list;
	}
	
	
}
