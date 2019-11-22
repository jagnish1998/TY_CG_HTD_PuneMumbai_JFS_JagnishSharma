package com.capgemini.springcore.annotation.bean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.annotation.bean.MessageBean;
import com.capgemini.springcore.annotation.bean.config.MessageConfig;

public class TestMessage {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageBean messageBean = context.getBean(MessageBean.class);
		System.out.println(messageBean.getMessage());
		
		MessageBean messageBean2 = context.getBean(MessageBean.class);
		System.out.println(messageBean2.getMessage());
		messageBean2.setMessage("Hello from messageBean2");
		
		System.out.println(messageBean.getMessage());
		System.out.println(messageBean2.getMessage());
		
	}//End of main Method
}//End of Class
