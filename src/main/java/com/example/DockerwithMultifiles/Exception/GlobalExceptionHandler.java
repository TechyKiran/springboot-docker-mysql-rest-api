package com.example.DockerwithMultifiles.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorResponse> studentnotFoundException(StudentNotFoundException snfe,WebRequest webreq)
	{
		
		ErrorResponse er = new ErrorResponse(
												snfe.getMessage(),
												webreq.getDescription(false),
												"We are Not able to find the Student details");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);
		
	}

}
