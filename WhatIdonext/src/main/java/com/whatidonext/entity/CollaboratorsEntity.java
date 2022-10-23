package com.whatidonext.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CollaboratorsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "COLLABORATOR_ID")
	private Short collaboratorId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "ROLL_ID")
	private Short rollId;

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

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Short getRollId() {
		return rollId;
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

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setRollId(Short rollId) {
		this.rollId = rollId;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

}
