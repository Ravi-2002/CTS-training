package com.auth.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.Exceptions.NoSuchElementException;
import com.auth.dao.ApplicationUserDao;
import com.auth.models.ApplicationUser;

@Service
public class ApplicationUserService {

	@Autowired
	private ApplicationUserDao dao;
	
	public ApplicationUser isValid(String username,String password)
	{
		System.out.println(username+"In service");
		ApplicationUser user=dao.findByUsername(username);
		if(user==null) {
			throw new NoSuchElementException("No such User");
			
		}
		else {
		if(password.equals(user.getPassword())){
			return user;
		}
		else {
			throw new NoSuchElementException("Invalid Password");
		}
		}
	}
	
	
}
