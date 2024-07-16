package com.order.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import com.order.models.Order;
import com.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping("/placeOrder")
	public ResponseEntity<Object> placeorder(@RequestBody Order order){
		if(service.add(order)&&service.addOrderItems(order)) {
		return new ResponseEntity<Object>(HttpStatus.CREATED);
		}
		else 
			return new ResponseEntity<Object>("Cannot add",HttpStatus.BAD_REQUEST);
	}
	
}
