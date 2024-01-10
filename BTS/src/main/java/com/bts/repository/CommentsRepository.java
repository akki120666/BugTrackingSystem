package com.bts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bts.entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {
	

	@Query(value = "select * from  comments where bug_id=?", nativeQuery = true)
	List<Comments> findListOfCommentsByBugId(int bugId);

}
