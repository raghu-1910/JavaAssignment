package com.rpm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rpm.entity.Trainee;

@Repository
public class TraineedaoImpl implements Traineedao{
	@PersistenceContext
	EntityManager entity;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		entity.persist(trainee);
		return entity.find(Trainee.class, trainee.getTrId());
	}

	@Override
	public Trainee updateTrainee(Trainee Trainee) {
		
		return entity.merge(Trainee);
	}

	@Override
	public String deleteTrainee(int trId) {
	Trainee tr = entity.find(Trainee.class, trId);
		
	if(tr!=null)
	{
		entity.remove(tr);
		return "Trainee Deleted";
	}
	else {
		return "no Trainee found";
	}
	}

	@Override
	public Trainee getTrainee(int trId) {
		return entity.find(Trainee.class,trId);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		TypedQuery<Trainee> result = entity.createQuery("select e from Trainee e",Trainee.class);
		
		return result.getResultList();
	}

}

