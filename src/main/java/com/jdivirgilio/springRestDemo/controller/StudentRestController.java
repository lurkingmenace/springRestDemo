package com.jdivirgilio.springRestDemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdivirgilio.sprintRestDemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> students;

	// Define endpoint for "/students"
	@PostConstruct
	private void loadStudents() {
		students = new ArrayList<>();
		students.add(new Student("John", "DiVirgilio"));
		students.add(new Student("Johnny", "McAnally"));
		students.add(new Student("Rachael", "Morabito"));
		students.add(new Student("Desiree", "Triporo"));
	}
	
	// Define endpoing for "/students"
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		return students;
	}

	// Define and endpoint for "/students/{studentId}" Path variable and argument names MUST match
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) throws StudentNotFoundException {
		
		if (studentId < 0 ||  studentId >= students.size()) {
			throw new StudentNotFoundException("Student ID " + Integer.toString(studentId) + " not found!"); 
		}
		return students.get(studentId);
	}
	
}

