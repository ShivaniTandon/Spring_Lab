package com.capg.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capg.spring.beans.Employee;
import com.capg.spring.beans.Sbu;

public class AppTest {
	public static void main(String[] args) { 
		AnnotationConfigApplicationContext iocContainer= new AnnotationConfigApplicationContext("com.capg.spring.beans");
    	
		Sbu s=iocContainer.getBean("sbu",Sbu.class);
		
		System.out.println(s);
	      
	}  
}