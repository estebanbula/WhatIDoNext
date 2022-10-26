package com.whatidonext.manager.taskstate;

import java.util.List;

import com.whatidonext.entity.TaskStateEntity;

public interface TaskStateManager {
	
	void deleteState(Short stateId);
	
	List<TaskStateEntity> findAllStates();
	
	TaskStateEntity findStateById(Short taskStateId);
	
	void saveState(TaskStateEntity taskState);
	
	void updateState(TaskStateEntity taskState) throws Exception;

}
