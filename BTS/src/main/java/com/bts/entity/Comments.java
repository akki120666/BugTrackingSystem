package com.bts.entity;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Comments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int commentID;
	
	private String commentDescription;
	
	@Column(updatable = false, insertable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@DateTimeFormat(pattern= "yyyy-MM-dd")
	private Date createdDate;
	
	@JoinColumn(name = "createdBy", insertable = false, updatable = false)
	@ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	private User user;
	

	private String createdBy; 
	
	@JoinColumn(name = "bugId", insertable = false,updatable = false)
	@ManyToOne(targetEntity = Bug.class, fetch = FetchType.EAGER)
	private Bug bug;
	
	private int bugId;

	public int getCommentID() {
		return commentID;
	}

	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}

	public String getCommentDescription() {
		return commentDescription;
	}

	public void setCommentDescription(String commentDescription) {
		this.commentDescription = commentDescription;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getBugId() {
		return bugId;
	}

	public void setBugId(int bugId) {
		this.bugId = bugId;
	}
	
	
	

}
