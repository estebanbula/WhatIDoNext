package com.whatidonext.manager.collaborators;

import java.util.List;

import com.whatidonext.entity.CollaboratorsEntity;

public interface CollaboratorsManager {
	
	void deleteCollaborator(Short collaboratorId);
	
	List<CollaboratorsEntity> findAllCollaborators();
	
	CollaboratorsEntity findCollaboratorById(Short collaboratorId);
	
	void saveCollaborator(CollaboratorsEntity collaborators);
	
	void updateCollaborator(CollaboratorsEntity collaborators);
}
