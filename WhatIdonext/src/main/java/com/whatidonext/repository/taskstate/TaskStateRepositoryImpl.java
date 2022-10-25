package com.whatidonext.repository.taskstate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.whatidonext.entity.TaskStateEntity;

@Repository
@SuppressWarnings("unchecked")
public class TaskStateRepositoryImpl implements TaskStateRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void delete(Short stateId) {
		Query query = entityManager.createNativeQuery("DELETE FROM TASK_STATE_ENTITY WHERE STATE_ID = ?1")
				.setParameter(1, stateId);
		query.executeUpdate();
	}

	@Override
	public List<TaskStateEntity> findAll() {
		Query query = entityManager.createNativeQuery(
				"SELECT STATE_ID, STATE_DESCRIPTION, ACTIVE, CREATION_DATE FROM TASK_STATE_ENTITY",
				TaskStateEntity.class);
		return query.getResultList();
	}

	@Override
	public TaskStateEntity findById(Short stateId) {
		return entityManager.find(TaskStateEntity.class, stateId);
	}

	@Override
	public void save(TaskStateEntity taskStates) {
		entityManager.persist(taskStates);
	}

	@Override
	public void update(TaskStateEntity taskStates) {
		entityManager.merge(taskStates);
		entityManager.flush();
	}

}
