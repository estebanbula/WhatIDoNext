package com.whatidonext.manager.taskstate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whatidonext.entity.TaskStateEntity;
import com.whatidonext.repository.taskstate.TaskStateRepository;

@Service
public class TaskStateManagerImpl implements TaskStateManager{
	
	@Autowired
	private TaskStateRepository taskStateRepository;

	@Override
	@Transactional
	public void saveState(TaskStateEntity taskState) {
		taskStateRepository.save(taskState);
	}

	@Override
	public void findTaskById(Short taskStateId) {
		taskStateRepository.findById(taskStateId);
	}

}
