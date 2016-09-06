package org.richard.java;

// this is a exception java class;

public class InvalidInputException extends Exception {

	private String errorDetails;
	
	public InvalidInputException(String reason, String error_details){
		super(reason);
		this.errorDetails = error_details;
	}
	
	public String getFaultInfo(){
		return errorDetails;
	}
	
}
