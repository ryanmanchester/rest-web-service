package com.ryanmanchester.rest.webservices.restfulwebservices.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ryanmanchester.rest.webservices.restfulwebservices.user.UserNotFoundException;

@ControllerAdvice
public class CustomResponseEntityHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionDetails> handleCustomException(Exception ex, WebRequest request) {
		ExceptionDetails details = new ExceptionDetails(ex.getMessage(), request.getDescription(false), LocalDateTime.now());
		
		return new ResponseEntity<ExceptionDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<ExceptionDetails> handleUserNotFoundException(Exception ex, WebRequest request) {
		ExceptionDetails details = new ExceptionDetails(ex.getMessage(), request.getDescription(false), LocalDateTime.now());
		
		return new ResponseEntity<ExceptionDetails>(details, HttpStatus.NOT_FOUND);
	}
}
