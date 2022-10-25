package com.whatidonext.repository.priorities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.whatidonext.entity.PrioritiesEntity;

@Repository
@SuppressWarnings("unchecked")
public class PrioritiesRepositoryImpl implements PrioritiesRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void delete(Short priorityId) {
		Query query = entityManager.createNativeQuery("DELETE FROM PRIORITIES_ENTITY WHERE PRIORITY_ID = ?1")
				.setParameter(1, priorityId);
		query.executeUpdate();
	}

	@Override
	public List<PrioritiesEntity> findAll() {
		Query query = entityManager.createNativeQuery(
				"SELECT PRIORITY_ID, PRIORITY_NAME, ACTIVE, CREATION_DATE FROM PRIORITIES_ENTITY",
				PrioritiesEntity.class);
		return query.getResultList();
	}

	@Override
	public PrioritiesEntity findById(Short priotityId) {
		return entityManager.find(PrioritiesEntity.class, priotityId);
	}

	@Override
	public void save(PrioritiesEntity priority) {
		entityManager.persist(priority);
	}

	@Override
	public void update(PrioritiesEntity priority) {
		entityManager.merge(priority);
	}

}
