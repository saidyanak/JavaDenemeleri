<<<<<<< HEAD
package com.example.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.ICustomerController;
import com.example.dto.DtoCustomer;
import com.example.services.ICustomerService;

@RestController
@RequestMapping("/rest/api/customer")
public class CustomerControllerImpl implements ICustomerController {

	@Autowired
	public ICustomerService iCustomerService;

	@Override
	@GetMapping(path = "/{id}")
	public DtoCustomer findById(@PathVariable(name = "id") Long id) {
		return iCustomerService.getCustomer(id);
	}
}
=======
package com.example.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.ICustomerController;
import com.example.dto.DtoCustomer;
import com.example.services.ICustomerService;

@RestController
@RequestMapping("/rest/api/customer")
public class CustomerControllerImpl implements ICustomerController {

	@Autowired
	public ICustomerService iCustomerService;

	@Override
	@GetMapping(path = "/{id}")
	public DtoCustomer findById(@PathVariable(name = "id") Long id) {
		return iCustomerService.getCustomer(id);
	}
}
>>>>>>> main
