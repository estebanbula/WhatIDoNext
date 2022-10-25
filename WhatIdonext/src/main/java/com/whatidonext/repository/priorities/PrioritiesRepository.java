package com.whatidonext.repository.priorities;

import java.util.List;

import com.whatidonext.entity.PrioritiesEntity;

public interface PrioritiesRepository {

	void delete(Short priorityId);

	List<PrioritiesEntity> findAll();

	PrioritiesEntity findById(Short priotityId);

	void save(PrioritiesEntity priority);

	void update(PrioritiesEntity priority);

}
