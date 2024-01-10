package com.bts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bts.dao.UserDao;
import com.bts.entity.User;
import com.bts.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public User saveUser(com.bts.entity.User user) {
		// TODO Auto-generated method stub
		return userDao.saveUser(user);
	}

	@Override
	public String loginUser(User user) {
		// TODO Auto-generated method stub

	User user1 = userDao.loginUser(user);
	
	
	if(user1.getUsername().equals(user.getUsername()) &&  user1.getPassword().equals(user.getPassword()) ) {
		return "Login Sucessfull";
	}
		
		
		return "Invalid Credentials";
	}

	
	
	
	

}
