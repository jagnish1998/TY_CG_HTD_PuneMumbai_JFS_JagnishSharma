package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Mobile;

public class MobileTest3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mobileConfig3.xml");
		Mobile mobile = context.getBean("mobileBean",Mobile.class);
		
		System.out.println("Brand Name "+mobile.getBrandName());
		System.out.println("Model Name "+mobile.getModelName());
		System.out.println("Display Size"+mobile.getMobileDisplay().getSize());
		System.out.println("Display Resoulation  "+mobile.getMobileDisplay().getDisplayResoulation());
	}
}
