package com.ir.service;

import java.util.List;
import java.util.Optional;

import com.ir.entity.Trainee;

public interface TraineeService {
	Trainee addTrainee(Trainee trainee);

	Trainee updateTrainee(Trainee trainee);

	void deleteTrainee(int trId);

	Optional<Trainee> getTrainee(int trId);

	Iterable<Trainee> getAllTrainees();


}
