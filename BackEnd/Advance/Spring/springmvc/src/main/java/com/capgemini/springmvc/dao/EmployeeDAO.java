package com.capgemini.springmvc.dao;

import java.util.List;

import com.capgemini.springmvc.bean.EmployeeInfoBean;

public interface EmployeeDAO {

	public EmployeeInfoBean getEmployee(int empId);
	public EmployeeInfoBean authenticate(int empId, String pwd);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);
	List<EmployeeInfoBean> getAllEmployees();
	boolean deleteEmployee(int empId);
	
	
}//End od DAO
