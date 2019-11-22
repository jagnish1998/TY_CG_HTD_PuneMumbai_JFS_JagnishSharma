package com.capgemini.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean2 {
	private String message;

	
	public MessageBean2() {
		System.out.println("It is Constructor");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public  void init(){
		System.out.println("Initilization Phase");
	}
	
	public void destroy() {
		System.out.println("Distroy Phase");
	}
}
