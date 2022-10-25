package com.whatidonext.repository.collaborators;

import java.util.List;

import com.whatidonext.entity.CollaboratorsEntity;

public interface CollaboratorsRepository {
	
	void delete(Short collaboratorId);
	
	List<CollaboratorsEntity> findAll();
	
	CollaboratorsEntity findById(Short collaboratorId);
	
	void save(CollaboratorsEntity collaborator);
	
	void update(CollaboratorsEntity collaborator);

}
