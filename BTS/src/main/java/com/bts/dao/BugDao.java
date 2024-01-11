package com.bts.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bts.entity.Bug;
import com.bts.entity.BugCommnetsWrapper;
import com.bts.entity.Comments;
import com.bts.repository.BugRepository;
import com.bts.repository.CommentsRepository;

@Service
public class BugDao {
	@Autowired
	private BugRepository bugRepository;
	@Autowired
	private CommentsRepository commentsRepository;

	public Bug saveBug(Bug bug) {
		// TODO Auto-generated method stub
		return bugRepository.save(bug);
	}

	
	public List<Bug> findAllBugsByUsername(Bug bug) {
		// TODO Auto-generated method stub
		return bugRepository.findAllBugsByUsername(bug.getUsername());
	}
	
	public List<Bug> findAllBugsByUsernameAndStatus(Bug bug) {
		// TODO Auto-generated method stub
		return bugRepository.findAllBugsByUsernameAndStatus(bug.getUsername(),bug.getBugStatus());
	}


	public BugCommnetsWrapper findBugById(int bugId) {
		// TODO Auto-generated method stub
		BugCommnetsWrapper bugCommnetsWrapper = new BugCommnetsWrapper() ;
		
		bugCommnetsWrapper.setBug( bugRepository.findById(bugId).get());
		 
		bugCommnetsWrapper.setCommentsList(commentsRepository.findListOfCommentsByBugId(bugId));
		
		return bugCommnetsWrapper;
	}


	public void deleteBug(int bugId) {
		// TODO Auto-generated method stub
		 bugRepository.deleteById(bugId);;;
	}


	public Comments saveComments(Comments comments) {
		// TODO Auto-generated method stub
          return  commentsRepository.save(comments);
	}


	  
	
}
