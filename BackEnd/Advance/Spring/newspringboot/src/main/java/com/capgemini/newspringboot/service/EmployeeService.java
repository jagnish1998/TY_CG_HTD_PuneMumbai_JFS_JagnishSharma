package com.capgemini.newspringboot.service;

import java.util.List;

import com.capgemini.newspringboot.bean.EmployeeInfoBean;


public interface EmployeeService {
	
	public EmployeeInfoBean getEmployee(int empId);
	public EmployeeInfoBean authenticate(int empId, String pwd);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);
	List<EmployeeInfoBean> getAllEmployees();
	boolean deleteEmployee(int empId);

}//End of Service
