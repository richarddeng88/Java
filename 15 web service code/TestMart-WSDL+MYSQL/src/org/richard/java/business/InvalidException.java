package org.richard.java.business;

public class InvalidException extends Exception{

	private String errorDetails;
	
	public InvalidException(String reason, String error_details){
		super(reason);
		this.errorDetails = error_details;
	}
	
	public String getFaultInfo(){
		return errorDetails;
	}
	
}
