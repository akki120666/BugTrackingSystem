package com.bts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bts.entity.User;
import com.bts.repository.UserRepository;


@Component
public class UserDao {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {

		return userRepository.save(user);

	}
	
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		
		User user1 = userRepository.findById(user.getUsername()).get();
			
		return user1;
	}

}
