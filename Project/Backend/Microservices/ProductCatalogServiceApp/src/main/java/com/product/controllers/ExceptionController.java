package com.product.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.product.Exceptions.NoProductsException;

@ControllerAdvice
public class ExceptionController  extends ResponseEntityExceptionHandler{

	@ExceptionHandler(NoProductsException.class)
	public ResponseEntity<Object> handler(NoProductsException e){
		
		return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
}
