package com.capg.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.mvc.entities.Trainee;
import com.capg.mvc.service.TraineeService;

@Controller
public class TraineeController {
	
	@Autowired
	private TraineeService traineeService;
	
	@RequestMapping(value="/login")
	public String loginDetails(@RequestParam("Username")String user,@RequestParam("Password")String pass){
		if(user.equals("user")&&pass.equals("user")) {			
			return "menu";
		}
		else {
			return "login";
		}
	}
	
	@RequestMapping(value="/newTrainee")
	public String showAddTrainee() {
		return "newTrainee";
	}
	
	@RequestMapping(value="/addTrainee",method=RequestMethod.POST)
	public String addTrainee(@ModelAttribute("trainee")Trainee trainee, ModelMap modelMap) {
		 Trainee savedTrainee = traineeService.addTrainee(trainee);
		 if(savedTrainee!=null) {
			 modelMap.addAttribute("msg", "Trainee saved in DB with Id:"+savedTrainee.getTraineeId());
		 }
		 else {
			 modelMap.addAttribute("msg", "Trainee not saved in DB");
		 }
	     return "results";
	}
	
	
	
	@RequestMapping(value="/deleteTrainee",method=RequestMethod.GET)
	public String showDeleteTrainee() {
		return "deleteTrainee";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String deleteTrainee(@RequestParam("traineeId") int traineeId, ModelMap modelMap) {
		Trainee trainee=traineeService.findTrainee(traineeId);
		modelMap.addAttribute("del",trainee);
		return "deleteTrainee";
		
	}
	@RequestMapping(value="/deleteTrainee/{traineeId}",method=RequestMethod.POST)
	public String delete(@PathVariable("traineeId") int traineeId, ModelMap modelMap) {
		traineeService.deleteTrainee(traineeId);
		return "deleteTrainee";
	}
	
	
	
	
	
	

	@RequestMapping(value="/modifyTrainee", method=RequestMethod.GET)
	public String showModifyTrainee() {
		return "modifyTrainee";
	}
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String modifyById(@RequestParam("traineeId") int traineeId, ModelMap modelMap) {
		Trainee trainee=traineeService.findTrainee(traineeId);
		modelMap.addAttribute("val",trainee);
		return "modifyTrainee";
	}
	
	@RequestMapping(value="/modifyTrainee",method=RequestMethod.POST)
	public String modify(@ModelAttribute("trainee") Trainee trainee, ModelMap modelMap) {
		traineeService.modifyTrainee(trainee);
		modelMap.addAttribute("msg","Trainee "+trainee.getTraineeId()+" modified");
		return "modifyTrainee";
	}

	
	
	
	
	@RequestMapping(value="/retrieveTrainee",method=RequestMethod.GET)
	public String showRetrieveTrainee() {
		return "retrieveTrainee";
	}
	
	@RequestMapping(value="/retrieve",method=RequestMethod.POST)
	public String retrievebyid(@RequestParam("traineeId") int traineeId, ModelMap modelMap ) {
		Trainee trainee=traineeService.findTrainee(traineeId);
		modelMap.addAttribute("t",trainee);
		return "retrieveTrainee";
	}
	
	

	
	
	@RequestMapping(value="/retrieveAllTrainee",method=RequestMethod.GET)
	public String retrieveall(ModelMap modelMap) {
		List<Trainee> list=traineeService.getAllTrainee();
		modelMap.addAttribute("list", list);
		return "retrieveAllTrainee";
	}
	
}
