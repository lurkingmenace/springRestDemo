package com.jdivirgilio.sprintRestDemo.entity;

public class StudentNotFoundException extends RuntimeException {

	public StudentNotFoundException(String message) {
		super(message);
	}
}
