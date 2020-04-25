package com.capg.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capg.spring.beans.Employee;

public class AppTest {
    public static void main(String[] args) {
    	
    	AnnotationConfigApplicationContext iocContainer= new AnnotationConfigApplicationContext("com.capg.spring.beans");
    	
    	Employee emp=iocContainer.getBean("emp",Employee.class);
		//Sbu sbu=emp.getSbuDetails();
    	
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		
		System.out.println(emp);
		
	}
}