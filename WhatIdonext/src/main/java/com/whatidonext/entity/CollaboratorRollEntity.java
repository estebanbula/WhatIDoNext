package com.whatidonext.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CollaboratorRollEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ROLL_ID")
	private Short rollId;

	@Column(name = "ROLL_NAME")
	private String rollName;

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

	public Short getRollId() {
		return rollId;
	}

	public String getRollName() {
		return rollName;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public void setRollId(Short rollId) {
		this.rollId = rollId;
	}

	public void setRollName(String rollName) {
		this.rollName = rollName;
	}
}
