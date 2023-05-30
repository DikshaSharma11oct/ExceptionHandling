package com.person.exception;

import java.util.Date;

public class ApiErrorResponse {
	
	private Integer errorCode;
	private String errorMessage;
	//private Date date;
	//running without component
	
	
	
	public ApiErrorResponse(){
		
	}
	public ApiErrorResponse(Integer errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		
	}
	
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	
	
	

}
