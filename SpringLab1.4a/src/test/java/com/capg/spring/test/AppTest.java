package com.capg.spring.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.spring.beans.Employee;
import com.capg.spring.beans.EmployeeDetails;

public class AppTest {
	
	public static void main(String[] args) { 
		ApplicationContext iocContainer=new ClassPathXmlApplicationContext("com/capg/spring/cfgs/spring_config.xml");
		EmployeeDetails empDetails=iocContainer.getBean("empl",EmployeeDetails.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id: ");
		int empId=sc.nextInt();
		
		System.out.println("Employee Details");
		System.out.println("-------------------------");
		for(int i=0;i<empDetails.getEmpList().size();) {
			Employee e=empDetails.getEmpList().get(i);
				if(e.getEmployeeId()==empId) {
					System.out.println("EmpId: "+e.getEmployeeId()+"\nEmpName: "+e.getEmployeeName()+
							"\nEmpSalary: "+e.getSalary()+"\nEmpAge: "+e.getAge());
					break;
				 }
				else 
				{
					System.out.println("Id does not exist");
					break;
				}
			}
	      
	}  
}