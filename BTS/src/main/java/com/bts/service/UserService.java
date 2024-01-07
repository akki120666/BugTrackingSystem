package com.bts.service;

import com.bts.entity.User;

public interface UserService {
	
	public User saveUser(User user);

	String loginUser(User user);

}
