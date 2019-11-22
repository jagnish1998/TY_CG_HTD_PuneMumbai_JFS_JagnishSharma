package com.capgemini.newspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.newspringboot.bean.EmployeeInfoBean;
import com.capgemini.newspringboot.bean.EmployeeResponse;
import com.capgemini.newspringboot.service.EmployeeService;

//@Controller
@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping(path = "/getEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public EmployeeResponse getEmployee(int empId) {
		EmployeeInfoBean employeeInfoBean  = service.getEmployee(empId);
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if(employeeInfoBean != null) {
			employeeResponse.setStatusCode(200);
			employeeResponse.setMessage("Success");
			employeeResponse.setDescription("Employee Found");
			employeeResponse.setEmployeeInfoBean(employeeInfoBean);
		}
		else {
			employeeResponse.setStatusCode(400);
			employeeResponse.setMessage("Failed");
			employeeResponse.setDescription("Employee Id " +empId+" Not Found");
		}
		return employeeResponse;
	}// End of get Employee
	

	
	@PutMapping(path = "/addEmployee", 
			consumes = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE },
			produces = MediaType.APPLICATION_JSON_VALUE)
	// @ResponseBody
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isAdded = service.addEmployee(employeeInfoBean);
		EmployeeResponse response = new EmployeeResponse();
		if(isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User Added SucessFully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Success");
			response.setDescription("Unable to Add Employee");
		}
		return response;
	}//nd of Add Employee
	
	

	@DeleteMapping(path = "/deleteEmployee/{empId}",
      produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	// @ResponseBody
	public EmployeeResponse deleteEmployee(@PathVariable("empId") int empId) {
		boolean isDeleted =  service.deleteEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		if(isDeleted) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User deleted SucessFully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Success");
			response.setDescription("Unable to Delete Employee");
		}
		return response;

	}

	
	
	
	@PostMapping(path = "/updateEmployee", 
			consumes = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE },
			produces = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse EmployeeResponse(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated =  service.updateEmployee(employeeInfoBean);
		EmployeeResponse response = new EmployeeResponse();
		if(isUpdated) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User Updated SucessFully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Success");
			response.setDescription("Unable to Update Employee");
		}
		return response;
	}
	
	
	
	
	@GetMapping(path = "/getAll",
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse getAllEmployee() {
		List<EmployeeInfoBean> list  = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();
		if(list != null && !list.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee List Found");
			response.setEmList(list);
		}
		else {
			response.setStatusCode(401);
			response.setMessage("Success");
			response.setDescription("Employee List Not Found");
		}
		return response;
	}
}
