package com.example.DockerwithMultifiles.Exception;

import java.time.LocalDateTime;

public class ErrorResponse {
	
	LocalDateTime timestamp;
	String errormessage;
	String errorDetails;
	String errorcode;
	
	
	public ErrorResponse() {
		super();
	}


	public ErrorResponse(String errormessage, String errorDetails, String errorcode) {
		this.timestamp = LocalDateTime.now();
		this.errormessage = errormessage;
		this.errorDetails = errorDetails;
		this.errorcode = errorcode;
	}


	public LocalDateTime getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}


	public String getErrormessage() {
		return errormessage;
	}


	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}


	public String getErrorDetails() {
		return errorDetails;
	}


	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}


	public String getErrorcode() {
		return errorcode;
	}


	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	
	
	

}

