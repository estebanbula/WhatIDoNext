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

import com.whatidonext.entity.CollaboratorsEntity;
import com.whatidonext.manager.collaborators.CollaboratorsManager;

@RestController
@RequestMapping("/collaborators")
public class CollaboratorsService {

	@Autowired
	private CollaboratorsManager collaboratorsManager;
	
	@DeleteMapping
	public void deleteTask(@RequestBody Short collaboratorId) {
		collaboratorsManager.deleteCollaborator(collaboratorId);
	}
	
	@GetMapping("/list-all")
	public List<CollaboratorsEntity> getAllCollaborators() {
		return collaboratorsManager.findAllCollaborators();
	}
	
	@GetMapping
	public CollaboratorsEntity getCollaborator(Short collaboratorId) {
		return collaboratorsManager.findCollaboratorById(collaboratorId);
	}
	
	@PostMapping
	public void newTask(@RequestBody CollaboratorsEntity collaborators) {
		collaboratorsManager.saveCollaborator(collaborators);
	}
	
	@PutMapping
	public void updateTask(@RequestBody CollaboratorsEntity collaborators) {
		collaboratorsManager.updateCollaborator(collaborators);
	}
}
