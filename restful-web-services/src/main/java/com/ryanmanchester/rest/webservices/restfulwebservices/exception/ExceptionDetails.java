package com.ryanmanchester.rest.webservices.restfulwebservices.exception;

import java.time.LocalDate;

public class ExceptionDetails {
	private String message;
	private String details;
	private LocalDate timestamp;
	
	public ExceptionDetails(String message, String details, LocalDate timestamp) {
		super();
		this.message = message;
		this.details = details;
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}
	

}
