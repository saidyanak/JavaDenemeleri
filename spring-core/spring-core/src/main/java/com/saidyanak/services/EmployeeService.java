package com.saidyanak.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saidyanak.model.Employee;
import com.saidyanak.model.UpdateEmployeeRequest;
import com.saidyanak.repository.EmployeeRepository;

@Service	
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployeeList()
	{
		return employeeRepository.getAllEmployeeList();
	}
	
	public Employee getEmployeeById(String id)
	{
		return employeeRepository.getEmployeeById(id);
	}
	
	public List<Employee> getEmployeesWithParams(String firstName, String lastName)
	{
		return employeeRepository.getEmployeeWithParams(firstName, lastName);
	}
	
	public Employee savEmployee(Employee employee)
	{
		return employeeRepository.saveEmployee(employee);
	}
	
	public boolean deleteEmployee(String id)
	{
		return employeeRepository.deleteEmployee(id);
	}
	
	public UpdateEmployeeRequest updateEmployee(String id, UpdateEmployeeRequest newEmployee)
	{
		return employeeRepository.updateEmployee(id, newEmployee);
	}
}














