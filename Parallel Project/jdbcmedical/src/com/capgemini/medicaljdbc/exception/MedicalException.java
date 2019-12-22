package com.capgemini.medicaljdbc.exception;

public class MedicalException extends RuntimeException{
	
	String msg;

	public MedicalException(String msg) {
		super();
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	
}
