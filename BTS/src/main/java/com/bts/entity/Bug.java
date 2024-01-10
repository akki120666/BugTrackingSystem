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
public class Bug {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bugId;
	
	private String bugCreatedBy;
	private  String bugStatus;
	
	
	
	private String bugDescription;
	
	@Column(updatable = false, insertable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@DateTimeFormat(pattern= "yyyy-MM-dd")
	private Date bugCreatedDate;
	
	@JoinColumn(name = "username", insertable = false, updatable = false)
	@ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	private User user;

	@Column(name = "username")
	private String username;

	
    private String assignedTo;
    
    private String reportedBy;
    
    
    private String title;
    
    private String department;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public int getBugId() {
		return bugId;
	}

	public void setBugId(int bugId) {
		this.bugId = bugId;
	}

	public String getBugCreatedBy() {
		return bugCreatedBy;
	}

	public void setBugCreatedBy(String bugCreatedBy) {
		this.bugCreatedBy = bugCreatedBy;
	}

	public String getBugStatus() {
		return bugStatus;
	}

	public void setBugStatus(String bugStatus) {
		this.bugStatus = bugStatus;
	}

	public String getBugDescription() {
		return bugDescription;
	}

	public void setBugDescription(String bugDescription) {
		this.bugDescription = bugDescription;
	}



	public Date getBugCreatedDate() {
		return bugCreatedDate ;
	}

	public void setBugCreatedDate(Date bugCreatedDate) {
		this.bugCreatedDate = bugCreatedDate;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getReportedBy() {
		return reportedBy;
	}

	public void setReportedBy(String reportedBy) {
		this.reportedBy = reportedBy;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}	

}
