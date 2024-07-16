package com.client.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(Exception.class)
	public String handler(Exception e,HttpSession session) {
		session.setAttribute("errorMessage", e.getMessage());
		return "error";
	}
}
