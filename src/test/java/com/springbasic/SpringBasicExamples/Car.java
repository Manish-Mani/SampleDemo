package com.springbasic.SpringBasicExamples;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	public void drive() {
		System.err.println("this is car driver");
	}
}
