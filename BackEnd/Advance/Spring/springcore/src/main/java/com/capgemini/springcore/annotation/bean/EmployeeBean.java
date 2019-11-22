package com.capgemini.springcore.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.objenesis.instantiator.annotations.Instantiator;

public class EmployeeBean {
	private int id;
	private String name;
	@Autowired
	@Qualifier("Developer")
	private DepartmentBean departmentBean;
	
	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}
	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@PostConstruct

	public void init() {
		System.out.println("This is Initilization");
	}
	
	@PreDestroy	
	public void destroy() {
		System.out.println("This is destroy");
	}
	
	

}
