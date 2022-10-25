package com.whatidonext.manager.tasks;

import java.util.List;

import com.whatidonext.entity.TasksEntity;

public interface TasksManager {
	
	void deleteTask(Short taskId);
	
	List<TasksEntity> findAllTasks();
	
	TasksEntity findTaskById(Short taskId);
	
	void saveTask(TasksEntity task);
	
	void updateTask(TasksEntity task);

}
