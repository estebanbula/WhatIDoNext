package com.whatidonext.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatidonext.entity.TaskStateEntity;
import com.whatidonext.manager.taskstate.TaskStateManager;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/task-states")
public class TaskStatesService {

	@Autowired
	private TaskStateManager taskStateManager;

	@DeleteMapping("delete/{stateId}")
	public void deleteState(@PathVariable("stateId") Short stateId) {
		taskStateManager.deleteState(stateId);
	}

	@GetMapping("/find-all")
	public List<TaskStateEntity> getAllStates() {
		return taskStateManager.findAllStates();
	}

	@GetMapping
	public TaskStateEntity getState(@RequestBody Short stateId) {
		return taskStateManager.findStateById(stateId);
	}

	@PostMapping("/save")
	public void newTaskState(@RequestBody TaskStateEntity taskState) {
		taskStateManager.saveState(taskState);
	}

	@PatchMapping("/update")
	public void updateState(@RequestBody TaskStateEntity taskState) throws Exception {
		taskStateManager.updateState(taskState);
	}
}
