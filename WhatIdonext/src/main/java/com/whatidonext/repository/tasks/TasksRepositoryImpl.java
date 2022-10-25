package com.whatidonext.repository.tasks;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.whatidonext.entity.TasksEntity;

@Repository
@SuppressWarnings("unchecked")
public class TasksRepositoryImpl implements TasksRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void delete(Short taskId) {
		Query query = entityManager.createNativeQuery("DELETE FROM TASKS_ENTITY WHERE TASK_ID = ?1").setParameter(1,
				taskId);
		query.executeUpdate();
	}

	@Override
	public List<TasksEntity> findAll() {
		Query query = entityManager.createNativeQuery(
				"SELECT TASK_ID, TASK_NAME, DESCRIPTION, COLLABORATOR_ID, PRIORITY_ID, STATE_ID, DELETED, CREATION_DATE, UPDATE_DATE FROM TASKS_ENTITY");
		return query.getResultList();
	}

	@Override
	public TasksEntity findById(Short taskId) {
		return entityManager.find(TasksEntity.class, taskId);
	}

	@Override
	public void save(TasksEntity task) {
		entityManager.persist(task);
	}

	@Override
	public void update(TasksEntity task) {
		entityManager.merge(task);
	}

}
