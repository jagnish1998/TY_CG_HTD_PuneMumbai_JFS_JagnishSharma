package com.capgemini.springcore.annotation.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.capgemini.springcore.annotation.bean.EmployeeBean;

@Import(DepartmentConfig.class)
@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setId(2019001);
		employeeBean.setName("jagnish");
		return employeeBean;
	}
	
	
}
