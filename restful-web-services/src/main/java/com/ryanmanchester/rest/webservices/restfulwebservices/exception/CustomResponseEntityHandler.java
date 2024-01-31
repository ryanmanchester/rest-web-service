package com.ryanmanchester.rest.webservices.restfulwebservices.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomResponseEntityHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleCustomException(Exception ex, WebRequest request) {
		ExceptionDetails details = new ExceptionDetails(ex.getMessage(), request.getDescription(false), LocalDateTime.now());
		
		return new ResponseEntity<Object>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
