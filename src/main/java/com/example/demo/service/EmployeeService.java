package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee()
	{
		return (List<Employee>) employeeRepository.findAll();
	}
	
	public Employee saveEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}

}
