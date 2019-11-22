package com.capgemini.springcore.annotation.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotation.bean.DepartmentBean;

@Configuration
public class DepartmentConfig {
	@Bean(name = "Developer")
	@Primary
	public DepartmentBean getDepartmentBean1() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(101);
		departmentBean.setDeptName("Developer");

		return departmentBean;
	}

	@Bean(name = "Testing")
	@Primary
	public DepartmentBean getDepartmentBean2() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(102);
		departmentBean.setDeptName("Testing");

		return departmentBean;
	}

	@Bean(name = "hr")
	@Primary
	public DepartmentBean getDepartmentBean3() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(103);
		departmentBean.setDeptName("HR");

		return departmentBean;
	}
}
