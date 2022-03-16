package com.onlinegasbooking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinegasbooking.entity.Login;
import com.onlinegasbooking.exceptions.IdNotFoundException;
import com.onlinegasbooking.service.LoginService;

/*********************************************************************
 * Description : This is Controller for Login
 *               This class helps to handle incoming browser requests , 
 *               retrieves necessary model data and returns appropriate 
 *               responses
 * 
 ********************************************************************** */

@RestController
public class LoginController {
	
	/**
	 * @Autowired annotation is used for dependency injection.In spring boot application,
	 * all loaded beans are eligible for auto wiring to another bean. The annotation 
	 * @Autowired in spring boot is used to auto-wire a bean into another bean.
	 */

	@Autowired
	private LoginService loginService;
	
	
	
	/**
	 * @PostMapping annotation maps HTTP POST requests onto specific handler methods.
	 * 
	 */
	

	@PostMapping("/login")
	public Login addUser(@Valid @RequestBody Login useradd) {
		return loginService.addUser(useradd);
	}
	
	

	/**
	 * @GetMapping GetMapping is used to handle GET type of request method
	 */
	
	@GetMapping("/login/{userId}")
	public Login getUserById(@Valid @PathVariable Integer userId) throws IdNotFoundException {
		return loginService.getUserById(userId);
	}
	
	
	
	/**
	 * @DeleteMapping annotation maps HTTP DELETE requests onto specific handler methods
	 */
	

	@DeleteMapping("/login")
	public String deleteUserById(@RequestBody Login userId) {
		return loginService.deleteUserById(userId);
	}

}
