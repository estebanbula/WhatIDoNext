package com.whatidonext.manager.collaboratorroll;

import java.util.List;

import com.whatidonext.entity.CollaboratorRollEntity;

public interface CollaboratorRollManager {
	
	void deleteRoll(Short roll) throws Exception;
	
	List<CollaboratorRollEntity> findAllRolles() throws Exception;
	
	CollaboratorRollEntity findRollById(Short rollId) throws Exception;
	
	void saveRoll(CollaboratorRollEntity roll) throws Exception;
	
	void updateRoll(CollaboratorRollEntity roll) throws Exception;

}
