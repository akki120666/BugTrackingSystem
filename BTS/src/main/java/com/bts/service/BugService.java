package com.bts.service;

import java.util.List;

import com.bts.entity.Bug;

public interface BugService {

	Bug saveBug(Bug bug);

	List<Bug> findAllBugsByUsernameAndStatus(Bug bug);

	Bug findBugById(int bugId);

}
