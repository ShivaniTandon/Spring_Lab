package com.capg.mvc.dao;

import java.util.List;

import com.capg.mvc.entities.Trainee;

public interface TraineeRepository{
	
	public Trainee add(Trainee trainee);
	public void delete(int traineeId);
	public Trainee findId(int traineeId);
	public void modify(Trainee trainee);
	public List<Trainee> findAll();
}