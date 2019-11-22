package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeDeptTest2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig3.xml");
		EmployeeBean employeeBean = context.getBean("employeeBean", EmployeeBean.class);

		System.out.println("Employee Id = " + employeeBean.getEmpId());
		System.out.println("Employee Name = " + employeeBean.getEmpName());
		System.out.println("Department Id = " + employeeBean.getDeptBean().getDeptId());
		System.out.println("Department Name = " + employeeBean.getDeptBean().getDeptName());
	}
}
