package com.bts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bts.utill.EmailService;

@SpringBootApplication
public class BtsApplication {
	
	@Autowired
	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(BtsApplication.class, args);
		
		
		
	}

}
