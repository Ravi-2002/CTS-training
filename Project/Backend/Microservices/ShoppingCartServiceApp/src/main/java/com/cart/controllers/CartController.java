package com.cart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cart.models.Cart;
import com.cart.models.CartDTO;
import com.cart.services.CartService;

@RestController
public class CartController {

	@Autowired
	private CartService service;
	
	@GetMapping("/getCartItems")
	public ResponseEntity<CartDTO> getCartItems(){
		CartDTO dto=new CartDTO();
		dto.setList(service.getAll());
		return new ResponseEntity<CartDTO>(dto,HttpStatus.OK);
	}
	
	@PostMapping("/addItem")
	public ResponseEntity<Object> addCartItem(@RequestBody Cart item){
		if(service.addToCart(item)) {
			return new ResponseEntity<Object>(HttpStatus.CREATED);
		}
		else
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteCartItem(@PathVariable("id") int id){
		service.delete(id);
		return new ResponseEntity<Object>("Deleted",HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/deleteAll")
	public ResponseEntity<Object> deleteAll(){
		service.deleteAll();
		return new ResponseEntity<Object>("Deleted",HttpStatus.NO_CONTENT);
	}
}
