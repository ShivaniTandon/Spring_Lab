package com.capg.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.spring.beans.Sbu;

public class AppTest {
	public static void main(String[] args) { 
		ApplicationContext iocContainer=new ClassPathXmlApplicationContext("com/capg/spring/cfgs/spring_config.xml");
		Sbu s=iocContainer.getBean("sbu",Sbu.class);
		
		System.out.println(s);
	      
	}  
}