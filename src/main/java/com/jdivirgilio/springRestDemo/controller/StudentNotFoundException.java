package com.jdivirgilio.springRestDemo.controller;

public class StudentNotFoundException extends RuntimeException {

	public StudentNotFoundException(String message) {
		super(message);
	}
}
