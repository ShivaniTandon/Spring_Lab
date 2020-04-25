package com.capg.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.mvc.dao.TraineeRepository;
import com.capg.mvc.entities.Trainee;

@Transactional
@Service
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	private TraineeRepository traineeRepository;

	@Override
	public Trainee addTrainee(Trainee trainee) {			 
		Trainee savedTrainee= traineeRepository.add(trainee);
		return savedTrainee;
}
	
	
	@Override
	public void deleteTrainee(int traineeId) {
		Trainee savedTrainee=traineeRepository.findId(traineeId);
		if(savedTrainee!=null) {
			traineeRepository.delete(traineeId);
		}
	}

	@Override
	public Trainee findTrainee(int traineeId) {
		Trainee savedTrainee=traineeRepository.findId(traineeId);
		return savedTrainee;
	}
	
	
	@Override
	public void modifyTrainee(Trainee t) {
		Trainee savedTrainee=traineeRepository.findId(t.getTraineeId());
		if(savedTrainee!=null) {
			traineeRepository.modify(t);
		}
	}

	@Override
	public List<Trainee> getAllTrainee() {
		return traineeRepository.findAll();
	}
}