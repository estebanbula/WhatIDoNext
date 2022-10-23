package com.whatidonext.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PrioritiesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRIORITY_ID")
	private Short priorityId;
	
	@Column(name = "PRIORITY_NAME")	
	private String priorityName;
	
	@Column(name = "ACTIVE")
	private String active;
	
	@Column(name = "CREATION_DATE")
	private String creationDate;

	public String getActive() {
		return active;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public Short getPriorityId() {
		return priorityId;
	}

	public String getPriorityName() {
		return priorityName;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public void setPriorityId(Short priorityId) {
		this.priorityId = priorityId;
	}

	public void setPriorityName(String priorityName) {
		this.priorityName = priorityName;
	}

}
