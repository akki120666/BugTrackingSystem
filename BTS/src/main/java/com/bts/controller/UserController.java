package com.bts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bts.entity.User;
import com.bts.service.UserService;

@RestController
@RequestMapping(value = "/bugtrackingsystem" )
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/saveUser")
	public User saveUser(@RequestBody User user) {
	
		return userService.saveUser(user);
	}
	
	
	@RequestMapping(value = "/login")
	public String loginUser(@RequestBody User user) {
		
		return userService.loginUser(user);
		
	}
	

}
