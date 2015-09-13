package com.getPrint.notes.exception;

public class AppException extends Exception {

	private static final long serialVersionUID = 1L;

	
	Integer status;

	int code;
    String message;

	 	public AppException(int status, int code, String message) {
		super(message);
		this.status = status;
		this.code = code;
		this.message = message;
	}

	public AppException() {
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}