package com.capgemini.springcore.annotation.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotation.bean.Dog;
import com.capgemini.springcore.annotation.bean.Panda;

@Configuration
public class AnimalConfig {

	@Bean(name = "dog")
	public Dog getDog() {
		Dog dog = new Dog();
		return dog;
	}

	@Bean(name = "panda")
	@Primary
	public Panda getPanda() {
		Panda panda = new Panda();
		return panda;
	}
}
