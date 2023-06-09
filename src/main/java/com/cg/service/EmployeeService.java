package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Employee;
import com.cg.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	//create
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	//read
	public List<Employee> fetchEmployeeList(){
		return employeeRepository.findAll();
	}
	//delete
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "Deleted Successfully";
	}
	//update
	public void updateEmployee(Employee employee, int id)   {  
		employeeRepository.save(employee);  
	} 
}

