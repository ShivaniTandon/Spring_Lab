package com.capg.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.mvc.dao.TraineeRepository;
import com.capg.mvc.entities.Trainee;
import com.capg.mvc.exception.TraineeException;

@Transactional
@Service
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	private TraineeRepository traineeRepository;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		try {
		Trainee savedTrainee= traineeRepository.add(trainee);
		return savedTrainee;
		}
		catch(Exception e) {
	    throw new TraineeException("Trainee with "+trainee.getTraineeId()+" already exists!");
	    }
}
	
	@Override
	public void deleteTrainee(int traineeId) {
		Trainee savedTrainee=traineeRepository.findId(traineeId);
		if(savedTrainee!=null) {
			traineeRepository.delete(traineeId);
		}
		else{
		    throw new TraineeException("Trainee with "+traineeId+" does not exists!");
		    	}
	}

	@Override
	public Trainee findTrainee(int traineeId) {
		Trainee savedTrainee=traineeRepository.findId(traineeId);
		if(savedTrainee!=null) {
			return savedTrainee;
		}
		else {
   		 throw new TraineeException("Trainee with "+traineeId+" does not exists!");
		}
		
	}
	
	
	@Override
	public void modifyTrainee(Trainee t) {
		Trainee savedTrainee=traineeRepository.findId(t.getTraineeId());
		if(savedTrainee!=null) {
			traineeRepository.modify(t);
		}
		else {
		    throw new TraineeException("Trainee with "+t.getTraineeId()+" does not exists!");
		}
	}

	@Override
	public List<Trainee> getAllTrainee() {
		return traineeRepository.findAll();
	}
}