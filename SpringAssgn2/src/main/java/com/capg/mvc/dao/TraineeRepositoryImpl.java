package com.capg.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capg.mvc.entities.Trainee;

@Repository
public class TraineeRepositoryImpl implements TraineeRepository {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Trainee add(Trainee trainee) {
		manager.persist(trainee);
		return trainee;
	}

	@Override
	public void delete(int traineeId) {
		Trainee trainee=manager.find(Trainee.class, traineeId);
		manager.remove(trainee);
		
	}

	@Override
	public Trainee findId(int traineeId) {
		Trainee t=manager.find(Trainee.class, traineeId);
		return t;
	}

	@Override
	public void modify(Trainee trainee) {
		manager.merge(trainee);
	}

	@Override
	public List<Trainee> findAll() {
		Query query = manager.createQuery("select t from Trainee t", Trainee.class);
		List<Trainee> allTrainee = query.getResultList();
		return allTrainee;
	}
}
