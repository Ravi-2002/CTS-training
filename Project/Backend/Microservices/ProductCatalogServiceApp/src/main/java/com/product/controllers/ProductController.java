package com.product.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.models.Product;
import com.product.models.productDTO;
import com.product.services.ProductServices;

@RestController
@CrossOrigin("*")
public class ProductController {
	@Autowired
	private ProductServices service;
	
	@GetMapping("/products")
	public ResponseEntity<productDTO> getProducts(){
		List<Product> list= service.getProducts();
		productDTO dto=new productDTO();
		dto.setList(list);
		return new ResponseEntity<productDTO>(dto,HttpStatus.OK);
		
	}
}
