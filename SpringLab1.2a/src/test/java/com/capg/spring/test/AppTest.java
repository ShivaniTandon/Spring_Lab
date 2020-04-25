package com.capg.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.spring.beans.Employee;

public class AppTest {
    public static void main(String[] args) {
    	
		ApplicationContext iocContainer=new ClassPathXmlApplicationContext("com/capg/spring/cfgs/spring_config.xml");
		Employee emp=iocContainer.getBean("emp",Employee.class);
		//Sbu sbu=emp.getSbuDetails();
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		
		System.out.println(emp);
		
	}
}