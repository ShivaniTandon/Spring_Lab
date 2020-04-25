package com.capg.spring.beans;

public class Employee 
{
	private int employeeId;
	private String employeeName;
	private double salary;
	private Sbu sbuDetails;
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
