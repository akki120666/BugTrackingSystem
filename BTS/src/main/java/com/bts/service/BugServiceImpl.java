package com.bts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bts.dao.BugDao;
import com.bts.entity.Bug;
import com.bts.entity.BugCommnetsWrapper;
import com.bts.entity.Comments;

@Service
public class BugServiceImpl implements BugService {
	@Autowired
	private BugDao bugDao;

	@Override
	public Bug saveBug(Bug bug) {
		// TODO Auto-generated method stub
		return bugDao.saveBug(bug) ;
	}

	@Override
	public List<Bug> findAllBugsByUsernameAndStatus(Bug bug) {
		// TODO Auto-generated method stub
		if(bug.getBugStatus() !=null) {
			return bugDao.findAllBugsByUsernameAndStatus(bug);
		}
		return bugDao.findAllBugsByUsername(bug);
	}

	@Override
	public BugCommnetsWrapper findBugById(int bugId) {
		// TODO Auto-generated method stub
		return bugDao.findBugById(bugId);
	}

	@Override
	public void deleteBug(int bugId) {
		// TODO Auto-generated method stub
		 bugDao.deleteBug(bugId);
	}

	@Override
	public Comments saveComments(Comments comments) {
		// TODO Auto-generated method stub
		return bugDao.saveComments(comments);
	}

	

}
