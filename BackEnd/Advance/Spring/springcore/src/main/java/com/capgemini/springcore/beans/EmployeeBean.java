package com.capgemini.springcore.beans;

public class EmployeeBean  {
	private int empId;
	private String empName;
	private DepartmentBean deptBean;
	
	
	public EmployeeBean(int empId, String empName, DepartmentBean deptBean) {
		this.empId = empId;
		this.empName = empName;
		this.deptBean = deptBean;
	}
	
	
	
	//Getter And Setter
	public int getEmpId() {
		return empId;
	}	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public DepartmentBean getDeptBean() {
		return deptBean;
	}
	public void setDeptBean(DepartmentBean deptBean) {
		this.deptBean = deptBean;
	}	
}//Ebd od class
