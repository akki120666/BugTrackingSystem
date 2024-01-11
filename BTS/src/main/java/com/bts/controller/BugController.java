package com.bts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bts.entity.Bug;
import com.bts.entity.BugCommnetsWrapper;
import com.bts.entity.Comments;
import com.bts.service.BugService;
import com.bts.utill.EmailService;

@RestController
@RequestMapping(value = "/bugtrackingsystem")
public class BugController {
	@Autowired
	private EmailService  emailService;
	@Autowired
	private BugService bugService;
	
	@RequestMapping(value = "/createbug")
	public Bug saveBug(@RequestBody Bug bug) {
		
		return  bugService.saveBug(bug);
	}
	
	@GetMapping(value="/listofbugs")
	public List<Bug> findAllBugsByUsernameAndStatus(@RequestBody Bug bug){
		return bugService.findAllBugsByUsernameAndStatus(bug);
	}
	
	@GetMapping(value= "/findbugbyid")
	public BugCommnetsWrapper findBugById(@RequestParam int bugId) {
		
		return bugService.findBugById(bugId);
	}
	
	
	@RequestMapping(value="/deletebug")
	public void deleteBug(@RequestParam int bugId) {
	
		 bugService.deleteBug(bugId);	
		
	}
	
	@RequestMapping(value="/createcomments")
	public Comments saveComments(@RequestBody Comments comments) {
		return bugService.saveComments(comments);
		
	}
	
	@RequestMapping(value="/sendemail")
	public void sendEmail() {
		emailService.sendEmail("akshaygoud20@gmail.com", "Bts Reset Password", "Click on the link to reset passwprd www.bugtrackingsystem/resetpassword.com");
		
	}
	
	
	
}
	
	






