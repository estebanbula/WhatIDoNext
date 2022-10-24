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
	public void delete(TaskStateEntity taskState) {
		entityManager.remove(taskState);
	}

	@Override
	public List<TaskStateEntity> findAll() {
		Query query = entityManager
				.createNativeQuery("SELECT STATE_ID, STATE_DEDSCRIPTION, ACTIVE, CREATION_DATE FROM TASK_STATES");
		return query.getResultList();
	}

	@Override
	public TaskStateEntity findById(Short stateId) {
		Query query = entityManager.createNativeQuery(
				"SELECT STATE_ID, STATE_DEDSCRIPTION, ACTIVE, CREATION_DATE FROM TASK_STATES WHERE STATE_ID = ?1")
				.setParameter(1, stateId);
		return (TaskStateEntity) query.getSingleResult();
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
