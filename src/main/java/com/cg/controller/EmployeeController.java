package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	//save
	@PostMapping("/employees")  
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	//read
	@GetMapping("/employees")
	public List<Employee> fetchEmployeeList(){
		return employeeService.fetchEmployeeList();
	}
	//delete
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
	}
	//update
	@PutMapping("/employee/{id}")  
	private Employee updateEmployee(@RequestBody Employee employee, int id)   
	{  
		employeeService.updateEmployee(employee, id);  
	return employee;  
	}  
}

