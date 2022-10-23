package com.whatidonext.manager.priorities;

import org.springframework.beans.factory.annotation.Autowired;

import com.whatidonext.entity.PrioritiesEntity;
import com.whatidonext.repository.priorities.PrioritiesRepository;

public class PriotitiesManagerImpl implements PrioritiesManager {
	
	@Autowired
	private PrioritiesRepository prioritiesRepository;

	@Override
	public void savePriotity(PrioritiesEntity priority) {
		prioritiesRepository.save(priority);
	}

}
