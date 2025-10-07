package com.rbt.studentmgmt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value=DataNotFoundException.class)
	ResponseEntity<String> dataNotFoundException()
	{
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body("Not FOUND");
	}

}
