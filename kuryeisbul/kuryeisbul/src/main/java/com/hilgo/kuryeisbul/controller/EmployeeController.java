package com.hilgo.kuryeisbul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hilgo.kuryeisbul.service.EmployeService;

@RestController
@RequestMapping(path = "/api/employee")
public class EmployeeController {

	
	@Autowired
	private EmployeService employeService;

	@PostMapping(path = "/{employeeId}")
	public boolean applyAdvert(@PathVariable(name = "employeeId") Long employeeId,
								@RequestBody Long advertId)
	{
		return employeService.applyAdvert(employeeId, advertId);
	}

}
