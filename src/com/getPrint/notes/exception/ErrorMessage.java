package com.getPrint.notes.exception;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {

	@XmlElement(name = "status")
	int status;

	@XmlElement(name = "code")
	int code;

	@XmlElement(name = "message")
	String message;

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

	public ErrorMessage() {
	}

	public ErrorMessage(AppException ex) {

		this.code = ex.getCode();
		this.message = ex.getMessage();
		this.status = ex.getStatus();

	}
}