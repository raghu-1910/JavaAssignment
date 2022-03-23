package com.ia.service;

import java.util.List;

import com.ia.entity.Trainee;

public interface TraineeService {
	Trainee addTrainee(Trainee trainee);

	Trainee updateTrainee(Trainee trainee);

	String deleteTrainee(int trId);

	Trainee getTrainee(int trId);

	List<Trainee> getAllTrainees();


}
