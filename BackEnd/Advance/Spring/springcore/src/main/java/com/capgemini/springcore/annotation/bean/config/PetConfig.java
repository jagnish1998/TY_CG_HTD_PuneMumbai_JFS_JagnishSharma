package com.capgemini.springcore.annotation.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.capgemini.springcore.annotation.bean.Pet;

@Import(AnimalConfig.class)
@Configuration
public class PetConfig {
	
	@Bean
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Sheru");
		return pet;
	}
}
