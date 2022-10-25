package com.whatidonext.manager.priorities;

import java.util.List;

import com.whatidonext.entity.PrioritiesEntity;

public interface PrioritiesManager {
	
	void deletePriority(Short priorityId);
	
	List<PrioritiesEntity> findAllPriorities();
	
	PrioritiesEntity findPriorityById(Short priorityId);
	
	void savePriotity(PrioritiesEntity priority);
	
	void updatePriority(PrioritiesEntity priority);

}
