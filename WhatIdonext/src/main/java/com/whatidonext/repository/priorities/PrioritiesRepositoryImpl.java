package com.whatidonext.repository.priorities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.whatidonext.entity.PrioritiesEntity;

@Repository
public class PrioritiesRepositoryImpl implements PrioritiesRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<PrioritiesEntity> findAll() {
		return null;
	}

	@Override
	public void save(PrioritiesEntity priority) {
		entityManager.persist(priority);
	}

}
