package com.ryanmanchester.rest.webservices.restfulwebservices.exception;


import java.time.LocalDateTime;

public class ExceptionDetails {
	private String message;
	private String details;
	private LocalDateTime timestamp;
	
	public ExceptionDetails(String message, String details, LocalDateTime localDateTime) {
		super();
		this.message = message;
		this.details = details;
		this.timestamp = localDateTime;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	

}
