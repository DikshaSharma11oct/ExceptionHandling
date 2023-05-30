package com.person.exception;



public class ApiResponseGetAll {
	private Integer timestamp;
    
	private Integer status;
    private String error;
    private String message;
    private String pathString;
    
    public ApiResponseGetAll(Integer timestamp, Integer status, String error, String message, String pathString) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.pathString = pathString;
	}
	public Integer getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPathString() {
		return pathString;
	}
	public void setPathString(String pathString) {
		this.pathString = pathString;
	}

}
