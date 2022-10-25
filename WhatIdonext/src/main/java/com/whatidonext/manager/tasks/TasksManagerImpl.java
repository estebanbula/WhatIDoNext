package com.whatidonext.manager.tasks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatidonext.entity.TasksEntity;
import com.whatidonext.repository.tasks.TasksRepository;

@Service
public class TasksManagerImpl implements TasksManager {
	
	@Autowired
	private TasksRepository tasksRepository;
	
	@Override
	public void deleteTask(Short taskId) {
		tasksRepository.delete(taskId);
	}

	@Override
	public List<TasksEntity> findAllTasks() {
		return tasksRepository.findAll();
	}

	@Override
	public TasksEntity findTaskById(Short taskId) {
		return tasksRepository.findById(taskId);
	}

	@Override
	public void saveTask(TasksEntity task) {
		tasksRepository.save(task);
	}

	@Override
	public void updateTask(TasksEntity task) {
		tasksRepository.update(task);
	}

}
