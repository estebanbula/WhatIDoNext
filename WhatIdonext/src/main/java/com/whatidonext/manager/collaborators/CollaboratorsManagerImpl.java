package com.whatidonext.manager.collaborators;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whatidonext.entity.CollaboratorsEntity;
import com.whatidonext.repository.collaborators.CollaboratorsRepository;

@Service
public class CollaboratorsManagerImpl implements CollaboratorsManager {
	
	@Autowired
	private CollaboratorsRepository collaboratorsRepository;

	@Override
	@Transactional
	public void deleteCollaborator(Short collaboratorId) {
		collaboratorsRepository.delete(collaboratorId);
	}

	@Override
	public List<CollaboratorsEntity> findAllCollaborators() {
		return collaboratorsRepository.findAll();
	}

	@Override
	public CollaboratorsEntity findCollaboratorById(Short collaboratorId) {
		return collaboratorsRepository.findById(collaboratorId);
	}

	@Override
	@Transactional
	public void saveCollaborator(CollaboratorsEntity collaborators) {
		collaboratorsRepository.save(collaborators);
	}

	@Override
	@Transactional
	public void updateCollaborator(CollaboratorsEntity collaborators) {
		collaboratorsRepository.update(collaborators);
	}

}
