package com.person.controllerAdvice;

import java.security.PublicKey;
import java.util.Date;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.person.exception.ApiErrorResponse;
import com.person.exception.EmptyInputException;
import com.person.exception.PersonNotFoundException;

import springfox.documentation.builders.ApiInfoBuilder;

@RestControllerAdvice
public class MyControllerAdvice {
	
	@ExceptionHandler(EmptyInputException.class)//to show msg to client we pass this class here
	public ResponseEntity<String> handleEmptyInput(EmptyInputException emptyInputEx){
		return new ResponseEntity<String>("Input fields are empty",HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(PersonNotFoundException.class)
	public ResponseEntity<String> handleNoPersonFoundException(PersonNotFoundException ex){
		
		return new ResponseEntity<String>("person not found with this id",HttpStatus.BAD_REQUEST);
		}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElement(NoSuchElementException noSuchElementException){
		return new ResponseEntity<String>("No element is found,kindly check it",HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handleNullPointerException(){
			return new ResponseEntity<String>("Field should not be empty",HttpStatus.BAD_REQUEST);
		}

	@ExceptionHandler(MethodArgumentNotValidException .class)
	public ResponseEntity<ApiErrorResponse> MethodArgumentNotValidException(){
		ApiErrorResponse apiResponse=new ApiErrorResponse(400,"Method argument not valid");
			return new ResponseEntity<ApiErrorResponse>(apiResponse,HttpStatus.BAD_REQUEST);
		}
	
	
}
