package com.whatidonext.repository.taskstate;

import com.whatidonext.entity.TaskStateEntity;

public interface TaskStateRepository {
	
	void save(TaskStateEntity taskStates);
	
	TaskStateEntity findById(Short stateId);

}
