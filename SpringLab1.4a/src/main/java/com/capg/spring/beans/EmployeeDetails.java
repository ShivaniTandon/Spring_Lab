package com.capg.spring.beans;

import java.util.List;

public class EmployeeDetails {
	
	private List<Employee> empList;
	
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
}