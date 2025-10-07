package com.rbt.moviemgmt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rbt.moviemgmt.dto.ErrorResponse;
import com.rbt.moviemgmt.exception.*;
//@RestControllerAdvice
//public class GlobalExcpetionHandler {
//	
//	@ExceptionHandler(value=DataNotFoundException.class)
//	ResponseEntity<String> DataNotFoundExceptionHandler()
//	{
//		return ResponseEntity
//				.status(HttpStatusCode.valueOf(404))
//				.body("Data Not Found");
//	}
	
	@RestControllerAdvice
	public class GlobalExceptionHandler {
	    @ExceptionHandler(value = UserNotFoundException.class)
	    public ResponseEntity<ErrorResponse> handleUserNotFoundException(UserNotFoundException e) {
	        ErrorResponse errorResponse = new ErrorResponse(e.getErrorCode(), e.getMessage());
	        return ResponseEntity.status(e.getStatus()).body(errorResponse);
	    }
	    
	    @ExceptionHandler(value = DataNotFoundException.class)
	    public ResponseEntity<ErrorResponse> handleDataNotFoundException(UserNotFoundException e) {
	        ErrorResponse errorResponse = new ErrorResponse(e.getErrorCode(), e.getMessage());
	        return ResponseEntity.status(e.getStatus()).body(errorResponse);
	    }

	    @ExceptionHandler(value = Exception.class)
	    public ResponseEntity<ErrorResponse> handleException(Exception e) {
	        ErrorResponse errorResponse = new ErrorResponse(500, "Internal Server Error");
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
	    }
	}	 
//
//}
