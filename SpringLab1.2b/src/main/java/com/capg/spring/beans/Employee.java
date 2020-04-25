package com.capg.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("singleton")
public class Employee 
{
	@Value("110")
	private int employeeId;
	
	@Value("Yashika")
	private String employeeName;
	
	@Value("46900")
	private double salary;
	
	@Autowired
	private Sbu sbuDetails;
	
	@Value("25")
	private int age;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Sbu getSbuDetails() {
		return sbuDetails;
	}
	public void setSbuDetails(Sbu sbuDetails) {
		this.sbuDetails = sbuDetails;
	}
	@Override
	public String toString() {
		return "Employee [ employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", age=" + age +",\nsbuDetails=" + sbuDetails+ " ]";
	}


}
