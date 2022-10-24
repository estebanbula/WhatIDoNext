package com.whatidonext.manager.taskstate;

import java.util.List;

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
	public void deleteState(TaskStateEntity taskState) {
		taskStateRepository.delete(taskState);
	}

	@Override
	public List<TaskStateEntity> findAllStates() {
		return taskStateRepository.findAll();
	}

	@Override
	public TaskStateEntity findStateById(Short taskStateId) {
		return taskStateRepository.findById(taskStateId);
	}

	@Override
	@Transactional
	public void saveState(TaskStateEntity taskState) {
		taskStateRepository.save(taskState);
	}

	@Override
	public void updateState(TaskStateEntity taskState) {
		taskStateRepository.update(taskState);
	}

}
