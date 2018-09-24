package com.jdivirgilio.springRestDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// This advice creates a global exception handler. The other way exceptions were handled in their own controller
@ControllerAdvice
public class StudentRestExceptionHandler {

	public StudentRestExceptionHandler() {
		// TODO Auto-generated constructor stub
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException snfe) {
		
		StudentErrorResponse ser = new StudentErrorResponse(HttpStatus.NOT_FOUND.value(), 
															snfe.getMessage(), 
															System.currentTimeMillis());

		return new ResponseEntity<>(ser, HttpStatus.NOT_FOUND);
	
	}
	
	// This is for any other input such as characters
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleGenericException(Exception e) {
		
		StudentErrorResponse ser = new StudentErrorResponse(HttpStatus.BAD_REQUEST.value(), 
															e.getMessage(), 
															System.currentTimeMillis());

		return new ResponseEntity<>(ser, HttpStatus.BAD_REQUEST);
	}
}
