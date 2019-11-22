package com.capgemini.springcore.annotation.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotation.bean.ISuzu;
import com.capgemini.springcore.annotation.bean.VolksWagon;

@Configuration
public class EngineConfig {

	@Bean(name = "isuze")
	@Primary
	public ISuzu getISuzu() {
		return new ISuzu();
	}
	
	@Bean(name = "vw")
	public VolksWagon getVolksWagon() {
		return new VolksWagon();
	}
}
