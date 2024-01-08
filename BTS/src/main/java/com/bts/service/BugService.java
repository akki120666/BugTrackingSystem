package com.bts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bts.entity.Bug;

@Service
public interface BugService {

	public Bug saveBug(Bug bug);

    public List<Bug> findAllBugsByUsernameAndStatus(Bug bug);

    public Bug findBugById(int bugId);

	public void deleteBug(int bugId);

}
