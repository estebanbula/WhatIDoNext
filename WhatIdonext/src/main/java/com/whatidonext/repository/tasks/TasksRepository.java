package com.whatidonext.repository.tasks;

import java.util.List;

import com.whatidonext.entity.TasksEntity;

public interface TasksRepository {
	
	void delete(Short tasksId);
	
	List<TasksEntity> findAll();
	
	TasksEntity findById(Short taskId);
	
	void save(TasksEntity task);
	
	void update(TasksEntity task);

}
