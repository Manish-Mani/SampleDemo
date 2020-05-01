package com.springbasic.SpringBasicExamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		Vehicle obj=(Vehicle) context.getBean("bike");
		obj.drive();
	}
   
}
