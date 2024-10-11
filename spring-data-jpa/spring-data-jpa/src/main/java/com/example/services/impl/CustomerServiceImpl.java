<<<<<<< HEAD
package com.example.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.DtoAdress;
import com.example.dto.DtoCustomer;
import com.example.entities.Adress;
import com.example.entities.Customer;
import com.example.repository.CustomerRepository;
import com.example.services.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	public CustomerRepository customerRepository;

	@Override
	public DtoCustomer getCustomer(Long id) {

		DtoCustomer dtoCustomer = new DtoCustomer();
		DtoAdress dtoAdress = new DtoAdress();

		Optional<Customer> custOptional = customerRepository.findById(id);
		if (custOptional.isEmpty()) {
			return null;
		}
		Customer customer = custOptional.get();
		Adress adress = customer.getAdress();
		BeanUtils.copyProperties(customer, dtoCustomer);
		BeanUtils.copyProperties(adress, dtoAdress);
		dtoCustomer.setAdress(dtoAdress);
		return dtoCustomer;
	}

}
=======
package com.example.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.DtoAdress;
import com.example.dto.DtoCustomer;
import com.example.entities.Adress;
import com.example.entities.Customer;
import com.example.repository.CustomerRepository;
import com.example.services.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	public CustomerRepository customerRepository;

	@Override
	public DtoCustomer getCustomer(Long id) {

		DtoCustomer dtoCustomer = new DtoCustomer();
		DtoAdress dtoAdress = new DtoAdress();

		Optional<Customer> custOptional = customerRepository.findById(id);
		if (custOptional.isEmpty()) {
			return null;
		}
		Customer customer = custOptional.get();
		Adress adress = customer.getAdress();
		BeanUtils.copyProperties(customer, dtoCustomer);
		BeanUtils.copyProperties(adress, dtoAdress);
		dtoCustomer.setAdress(dtoAdress);
		return dtoCustomer;
	}

}
>>>>>>> main
