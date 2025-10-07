package com.rbt.studentmgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rbt.studentmgmt.entity.Student;
import com.rbt.studentmgmt.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	@GetMapping("/{id}")
	ResponseEntity<Student> findById(@PathVariable int id)
	{
		return ResponseEntity.ok(studentService.findById(id));
	}

}
