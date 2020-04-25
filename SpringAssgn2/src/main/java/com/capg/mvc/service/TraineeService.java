package com.capg.mvc.service;

import java.util.List;

import com.capg.mvc.entities.Trainee;

public interface TraineeService {

	public Trainee addTrainee(Trainee trainee);
	public void deleteTrainee(int traineeId);
	public Trainee findTrainee(int traineeId);
	public void modifyTrainee(Trainee t);
	public List<Trainee> getAllTrainee();
}
