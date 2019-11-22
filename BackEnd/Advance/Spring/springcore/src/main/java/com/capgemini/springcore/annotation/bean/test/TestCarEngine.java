package com.capgemini.springcore.annotation.bean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotation.bean.Car;

public class TestCarEngine {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("carConfig.xml");
	Car car  = context.getBean("car",Car.class);
	
	System.out.println(car.getModelName());
	System.out.println(car.getModelNo());
	System.out.println(car.getEngine().getCC());
	System.out.println(car.getEngine().getType());
}
}
