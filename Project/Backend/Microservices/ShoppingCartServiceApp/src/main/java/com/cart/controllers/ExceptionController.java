package com.cart.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cart.Exceptions.NoRecordsException;
@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler{

@ExceptionHandler(NoRecordsException.class)
public ResponseEntity<Object> handler(NoRecordsException e){
	return new ResponseEntity<Object>(e.getMessage(),HttpStatus.BAD_REQUEST);
}	
	
	
}
