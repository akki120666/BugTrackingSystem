package com.bts.entity;

import java.util.ArrayList;
import java.util.List;

public class BugCommnetsWrapper {
	
	Bug bug = new Bug();
	
	List<Comments> commentsList = new ArrayList<>();

	public Bug getBug() {
		return bug;
	}

	public void setBug(Bug bug) {
		this.bug = bug;
	}

	public List<Comments> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<Comments> commentsList) {
		this.commentsList = commentsList;
	}
	

}
