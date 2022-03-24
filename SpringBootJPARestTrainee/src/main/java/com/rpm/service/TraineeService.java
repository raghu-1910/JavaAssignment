package com.rpm.service;

import java.util.List;

import com.rpm.entity.Trainee;

public interface TraineeService {
	Trainee addTrainee(Trainee trainee);

	Trainee updateTrainee(Trainee trainee);

	String deleteTrainee(int trId);

	Trainee getTrainee(int trId);

	List<Trainee> getAllTrainees();


}
