package com.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.models.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

//	public List<Product> getproducts();
}
