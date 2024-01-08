package com.bts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bts.entity.Bug;

public interface BugRepository extends JpaRepository<Bug, Integer> {

	
	@Query(value = "select * from bug where username=? and bug_Status=?" ,nativeQuery = true)
	List<Bug> findAllBugsByUsernameAndStatus(String username , String bugStatus);

	
	@Query(value = "select * from  bug where username=?", nativeQuery = true)
	List<Bug> findAllBugsByUsername(String username);

}
