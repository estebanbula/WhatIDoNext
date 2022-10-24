package com.whatidonext.repository.taskstate;

import java.util.List;

import com.whatidonext.entity.TaskStateEntity;

public interface TaskStateRepository {
	
	void delete(TaskStateEntity taskState);
	
	List<TaskStateEntity> findAll();
	
	TaskStateEntity findById(Short stateId);
	
	void save(TaskStateEntity taskStates);
	
	void update(TaskStateEntity taskStates);

}
