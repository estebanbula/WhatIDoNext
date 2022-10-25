package com.whatidonext.repository.collaboratorroll;

import java.util.List;

import com.whatidonext.entity.CollaboratorRollEntity;

public interface CollaboratorRollRepository {
	
	void delete(Short rollId);
	
	List<CollaboratorRollEntity> findAll();
	
	CollaboratorRollEntity findById(Short rollId);
	
	void save(CollaboratorRollEntity collaboratorRoll);
	
	void update(CollaboratorRollEntity collaboratorRoll);

}
