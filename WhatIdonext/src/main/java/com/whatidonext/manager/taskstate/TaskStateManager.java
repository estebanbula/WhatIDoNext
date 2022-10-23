package com.whatidonext.manager.taskstate;

import com.whatidonext.entity.TaskStateEntity;

public interface TaskStateManager {
	
	void saveState(TaskStateEntity taskState);
	
	void findTaskById(Short taskStateId);

}
