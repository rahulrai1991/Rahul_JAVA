package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/getAllEmployee")
	public ResponseEntity<List<Employee>> getAll()
	{
		List<Employee> listEmp=employeeService.getAllEmployee();
		return new ResponseEntity<List<Employee>>(listEmp, HttpStatus.OK);
	}
	@RequestMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
	{
		Employee employee1=employeeService.saveEmployee(employee);
		return new ResponseEntity<Employee>(employee1, HttpStatus.OK);
		
	}

}
