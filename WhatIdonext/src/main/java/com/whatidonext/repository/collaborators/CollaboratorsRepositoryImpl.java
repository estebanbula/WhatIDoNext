package com.whatidonext.repository.collaborators;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.whatidonext.entity.CollaboratorsEntity;

@Repository
@SuppressWarnings("unchecked")
public class CollaboratorsRepositoryImpl implements CollaboratorsRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void delete(Short collaboratorId) {
		Query query = entityManager.createNativeQuery("DELETE FROM COLLABORATORS_ENTITY WHERE COLLABORATOR_ID = ?1")
				.setParameter(1, collaboratorId);
		query.executeUpdate();
	}

	@Override
	public List<CollaboratorsEntity> findAll() {
		Query query = entityManager.createNativeQuery(
				"SELECT COLLABORATOR_ID, FIRST_NAME, LAST_NAME, ROLL_ID, DELETED, CREATION_DATE, UPDATE_DATE FROM COLLABORATORS",
				CollaboratorsEntity.class);
		return query.getResultList();
	}

	@Override
	public CollaboratorsEntity findById(Short collaboratorId) {
		return entityManager.find(CollaboratorsEntity.class, collaboratorId);
	}

	@Override
	public void save(CollaboratorsEntity collaborator) {
		entityManager.persist(collaborator);
	}

	@Override
	public void update(CollaboratorsEntity collaborator) {
		entityManager.merge(collaborator);
	}

}
