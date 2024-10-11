package com.hilgo.kuryeisbul.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hilgo.kuryeisbul.entity.Advert;
import com.hilgo.kuryeisbul.entity.Employee;
import com.hilgo.kuryeisbul.repo.AdvertRepo;
import com.hilgo.kuryeisbul.repo.EmployeeRepo;

@Service
public class EmployeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private AdvertRepo advertRepo;
	
	public boolean applyAdvert(Long employeeId, Long advertId)
	{
		Optional<Employee> dbEmployee =  employeeRepo.findById(employeeId);
		Optional<Advert> dbAdvert = advertRepo.findById(advertId);
		if (dbEmployee.isEmpty() || dbAdvert.isEmpty()) {
			return false;
		}
		Advert advert = dbAdvert.get();
		Employee employee = dbEmployee.get();
		employee.getAdvert().add(advert);
		employeeRepo.save(employee);
		return true;
	
	
	}
}
