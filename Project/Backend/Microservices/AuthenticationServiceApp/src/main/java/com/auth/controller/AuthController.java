package com.auth.controller;

//import java.util.Map;

//import javax.ws.rs.Path;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.auth.models.ApplicationUser;
import com.auth.service.ApplicationUserService;

@RestController
public class AuthController {

	@Autowired
	ApplicationUserService service;
	
	@PostMapping("/auth")
	public ResponseEntity<ApplicationUser> authenticate(@RequestBody ApplicationUser user){
		ApplicationUser u = service.isValid(user.getUsername(), user.getPassword());
		
			
			return new ResponseEntity<ApplicationUser>(u,HttpStatus.OK);
	}
		
	
	
}
