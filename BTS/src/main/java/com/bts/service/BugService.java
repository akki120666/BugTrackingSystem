package com.bts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bts.entity.Bug;
import com.bts.entity.BugCommnetsWrapper;
import com.bts.entity.Comments;

@Service
public interface BugService {

	public Bug saveBug(Bug bug);

    public List<Bug> findAllBugsByUsernameAndStatus(Bug bug);

    public BugCommnetsWrapper findBugById(int bugId);

	public void deleteBug(int bugId);

	public Comments saveComments(Comments comments);

}
