package com.whatidonext.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TasksEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TASK_ID")
	private Short taskId;
	
	@Column(name = "TASK_NAME")
	private String taskName;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "COLLABORATOR_ID")
	private Short collaboratorId;
	
	@Column(name = "PRIORITY_ID")
	private Short priorityId;
	
	@Column(name = "STATE_ID")
	private Short stateId;
	
	@Column(name = "DELETED")
	private String deleted;

	@Column(name = "CREATION_DATE")
	private String creationDate;

	@Column(name = "UPDATE_DATE")
	private String updateDate;

	public Short getCollaboratorId() {
		return collaboratorId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public String getDeleted() {
		return deleted;
	}

	public String getDescription() {
		return description;
	}

	public Short getPriorityId() {
		return priorityId;
	}

	public Short getStateId() {
		return stateId;
	}

	public Short getTaskId() {
		return taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setCollaboratorId(Short collaboratorId) {
		this.collaboratorId = collaboratorId;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPriorityId(Short priorityId) {
		this.priorityId = priorityId;
	}

	public void setStateId(Short stateId) {
		this.stateId = stateId;
	}

	public void setTaskId(Short taskId) {
		this.taskId = taskId;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

}
