package com.bts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bts.entity.Bug;
import com.bts.service.BugService;

@RestController
@RequestMapping(value = "/bugtrackingsystem")
public class BugController {
	
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
	public Bug findBugById(@RequestParam int bugId) {
		
		return bugService.findBugById(bugId);
	}
	
	
	@RequestMapping(value="/deletebug")
	public void deleteBug(@RequestParam int bugId) {
	
		 bugService.deleteBug(bugId);	
		
	}
	
	
}
	
	






