package com.capgemini.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeconfig.xml");
		//creating emp1 object
		EmployeeBean emp1 = context.getBean("employeeBean1",EmployeeBean.class);
		
		System.out.println("Enter employee 1 id");
		emp1.setEmpId(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Enter employee 1 name");
		emp1.setEmpName(scan.nextLine());
		
		//creating emp2 object
		EmployeeBean emp2 = context.getBean("employeeBean1",EmployeeBean.class);
		
		System.out.println("Enter employee 2 id");
		emp2.setEmpId(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Enter employee 2 name");
		emp2.setEmpName(scan.nextLine());
		
		
		System.out.println("Employee Id is "+emp1.getEmpId());
		System.out.println("Employee Name is "+emp1.getEmpName());
		
		System.out.println("Employee Id is "+emp2.getEmpId());
		System.out.println("Employee Name is "+emp2.getEmpName());
	
		
	}//End of Main
}// End of class
