package com.cart.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.Exceptions.NoRecordsException;
import com.cart.dao.CartDao;
import com.cart.models.Cart;

@Service
public class CartService {

	@Autowired
	private CartDao dao;
	
	public List<Cart> getAll()
	{
		List<Cart> list=dao.findAll();
		if(list.isEmpty()) {
			throw new NoRecordsException("No records found");
		}
		else {
			return list;
		}
	}
	
	public boolean addToCart(Cart item) {
	Cart cart=	dao.save(item);
	if(cart!=null)
		return true;
	else
		return false;
	}
	
	public boolean delete(int id)
	{
		dao.deleteById(id);
		Optional<Cart> cart=dao.findById(id);
		Cart cart1=cart.get();
		if(cart1==null) {
			return true;
			}
		else {
			throw new NoRecordsException("No record to delete");
		}
	}
	public boolean deleteAll() {
		dao.deleteAll();
		return true;
	}
}
