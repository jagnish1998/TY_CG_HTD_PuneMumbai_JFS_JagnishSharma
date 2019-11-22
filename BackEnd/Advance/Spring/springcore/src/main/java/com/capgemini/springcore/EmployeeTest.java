package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeBean bean = (EmployeeBean)context.getBean("employeeBean1");
		
		EmployeeBean bean2 = context.getBean("employeeBean2",EmployeeBean.class);
		
		System.out.println("Employee Id is "+bean.getEmpId());
		System.out.println("Employee Name is "+bean.getEmpName());
		
		System.out.println("Employee Id is "+bean2.getEmpId());
		System.out.println("Employee Name is "+bean2.getEmpName());
	
	}
}
