package com.bts.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bts.entity.Bug;
import com.bts.repository.BugRepository;

@Service
public class BugDao {
	@Autowired
	private BugRepository bugRepository;

	public Bug saveBug(Bug bug) {
		// TODO Auto-generated method stub
		return bugRepository.save(bug);
	}

	
	public List<Bug> findAllBugsByUsername(Bug bug) {
		// TODO Auto-generated method stub
		return bugRepository.findAllBugsByUsername(bug);
	}
	
	public List<Bug> findAllBugsByUsernameAndStatus(Bug bug) {
		// TODO Auto-generated method stub
		return bugRepository.findAllBugsByUsernameAndStatus(bug);
	}


	public Bug findBugById(int bugId) {
		// TODO Auto-generated method stub
		return bugRepository.findById(bugId).get();
	}


	

	
}
