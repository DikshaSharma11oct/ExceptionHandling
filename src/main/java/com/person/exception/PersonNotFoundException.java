package com.person.exception;

import org.springframework.stereotype.Component;


public class PersonNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PersonNotFoundException(String msg) {
		super(msg);
	}
	 public PersonNotFoundException(){
		
	}

	
	

}
