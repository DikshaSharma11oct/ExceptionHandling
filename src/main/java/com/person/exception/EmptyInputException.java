package com.person.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class EmptyInputException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String errorCode;
	private String errorMsg;
	
	public EmptyInputException(String errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public EmptyInputException() {
		
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
