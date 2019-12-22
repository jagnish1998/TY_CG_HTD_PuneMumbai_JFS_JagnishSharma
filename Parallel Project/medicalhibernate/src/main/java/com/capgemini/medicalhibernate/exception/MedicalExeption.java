package com.capgemini.medicalhibernate.exception;

public class MedicalExeption extends RuntimeException{
	
	String msg;

	public MedicalExeption(String msg) {
		super();
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	
}
