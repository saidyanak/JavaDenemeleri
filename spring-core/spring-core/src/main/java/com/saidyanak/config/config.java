package com.saidyanak.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.saidyanak.model.Employee;

@Configuration
public class config {

	@Bean
	public List<Employee> employeeList()
	{
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("1","Said","Yanak"));
		employees.add(new Employee("2","Gokce","Temel"));
		employees.add(new Employee("3","Hüseyin","Soyisim"));
		employees.add(new Employee("4","İlknur","Soyisim"));
		employees.add(new Employee("5","Said","Temel"));
		
		return employees;
	}
	
}
