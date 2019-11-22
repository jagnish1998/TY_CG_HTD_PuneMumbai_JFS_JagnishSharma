package com.capgemini.springcore.annotation.bean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.annotation.bean.Pet;
import com.capgemini.springcore.annotation.bean.config.PetConfig;

public class PetTest {
	public static void main(String[] args) {
			ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
			Pet pet = context.getBean(Pet.class);
			
			System.out.println(pet.getName());
			pet.getAnimal().walk();
			pet.getAnimal().speak();;
			pet.getAnimal().eat();
			
	}
}
