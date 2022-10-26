package com.whatidonext.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatidonext.entity.PrioritiesEntity;
import com.whatidonext.manager.priorities.PrioritiesManager;

@RestController
@RequestMapping("/priorities")
public class PrioritiesService {
	
	@Autowired
	private PrioritiesManager prioritiesManager;
	
	@GetMapping
	public PrioritiesEntity getPriority(@RequestBody Short priorityId) {
		return prioritiesManager.findPriorityById(priorityId);
	}
	
	@GetMapping("/list-all")
	public List<PrioritiesEntity> gatAllPriorities() {
		return prioritiesManager.findAllPriorities();
	}
	
	@PostMapping
	public void newPriority(@RequestBody PrioritiesEntity priority) {
		prioritiesManager.savePriotity(priority);
	}
	
	@PutMapping
	public void updatePriority(@RequestBody PrioritiesEntity priority) {
		prioritiesManager.updatePriority(priority);
	}
	
	@DeleteMapping("/delete")
	public void deletePriority(@RequestBody Short priorityId) {
		prioritiesManager.deletePriority(priorityId);
	}

}
