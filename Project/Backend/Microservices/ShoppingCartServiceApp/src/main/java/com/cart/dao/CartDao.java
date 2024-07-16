package com.cart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cart.models.Cart;

public interface CartDao  extends JpaRepository<Cart, Integer>{

//	public List<Cart> getAll();
//	public boolean addToCart(Cart item);
//	public boolean delete(int id);
//	public boolean deleteAll();
	
}
