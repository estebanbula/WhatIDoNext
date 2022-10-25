package com.whatidonext.manager.collaboratorroll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatidonext.entity.CollaboratorRollEntity;
import com.whatidonext.repository.collaboratorroll.CollaboratorRollRepository;

@Service
public class CollaboratorRollManagerImpl implements CollaboratorRollManager {

	@Autowired
	private CollaboratorRollRepository rollRepository;

	@Override
	public void deleteRoll(Short roll) throws Exception {
		rollRepository.delete(roll);
	}

	@Override
	public List<CollaboratorRollEntity> findAllRolles() throws Exception {
		return rollRepository.findAll();
	}

	@Override
	public CollaboratorRollEntity findRollById(Short rollId) throws Exception {
		return rollRepository.findById(rollId);
	}

	@Override
	public void saveRoll(CollaboratorRollEntity roll) throws Exception {
		rollRepository.save(roll);
	}

	@Override
	public void updateRoll(CollaboratorRollEntity roll) throws Exception {
		rollRepository.update(roll);
	}

}
