package com.ir.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ir.dao.Traineedao;
import com.ir.entity.Trainee;

@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {
	@Autowired
	Traineedao dao;
	@Override
	public Trainee addTrainee(Trainee trainee) {
		return dao.save(trainee);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		return dao.save(trainee);
	}

	@Override
	public void deleteTrainee(int trId) {
			dao.deleteById(trId);
	}

	@Override
	public Optional<Trainee> getTrainee(int trId) {
		return dao.findById(trId);
	}

	@Override
	public Iterable<Trainee> getAllTrainees() {
		
		return dao.findAll();
	}

}
