package com.capgemini.springcore.annotation.bean.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.capgemini.springcore.annotation.bean.EmployeeBean;
import com.capgemini.springcore.annotation.bean.config.EmployeeConfig;

public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		System.out.println("Employee Id is "+employeeBean.getId());
		System.out.println("Employee Name is "+employeeBean.getName());
		System.out.println("Department Name is "+employeeBean.getDepartmentBean().getDeptId());
		System.out.println("Department Name is "+employeeBean.getDepartmentBean().getDeptName());
		
		((AbstractApplicationContext)context).close();
	}

}
