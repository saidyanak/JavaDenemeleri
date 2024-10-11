package com.saidyanak.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saidyanak.model.Employee;
import com.saidyanak.model.UpdateEmployeeRequest;

@Repository
public class EmployeeRepository {
	
	@Autowired
	private List<Employee> employees;
	
	public List<Employee> getAllEmployeeList()
	{
		return employees;
	}
	
	public Employee getEmployeeById(String id)
	{
		Employee findEmployee = null;
		for (Employee employee : employees) {
			if (id.equals(employee.getId())) {
				findEmployee = employee;
				break;
			}
		}
		return findEmployee;
	}

	
	public List<Employee> getEmployeeWithParams(String firstName, String lastName)
	{
		 List<Employee> employeeWithParam = new ArrayList<Employee>();
		 
		 if (firstName == null && lastName == null) 
		 {
			return employees;
		 }
		 for (Employee employee : employees) 
		 {
			 if (firstName != null && lastName != null) {
				if (employee.getFirstName().equalsIgnoreCase(firstName)
						&& employee.getLastName().equalsIgnoreCase(lastName)) {
					employeeWithParam.add(employee);
				}
			}
			if (firstName != null && lastName == null) {
				if (employee.getFirstName().equalsIgnoreCase(firstName)) {
					employeeWithParam.add(employee);
				}
			}
			if (firstName == null && lastName != null) {
				if (employee.getLastName().equalsIgnoreCase(lastName)) {
					employeeWithParam.add(employee);
				}
			}
		 }
		 return employeeWithParam;
	}
	
	public Employee saveEmployee(Employee employee)
	{
		employees.add(employee);
		return employee;
	}
	
	
	
	public boolean deleteEmployee(String id)
	{
		for (Employee employee : employees) {
			if (id.equals(employee.getId())) {
				employees.remove(employee);
				return true;
			}
		}
		return false;
	}
	
	public UpdateEmployeeRequest updateEmployee(String id, UpdateEmployeeRequest newEmployee)
	{
		for (Employee employee : employees) {
			if (id.equals(employee.getId())) {
				employee.setFirstName(newEmployee.getFirstName());
				employee.setLastName(newEmployee.getLastName());
			}
		}
		return newEmployee;
	}
	
	
	
	
	
}
