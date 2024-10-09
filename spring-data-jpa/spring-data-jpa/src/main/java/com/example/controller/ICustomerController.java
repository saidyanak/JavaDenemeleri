package com.example.controller;

import com.example.dto.DtoCustomer;

public interface ICustomerController {

	public DtoCustomer findById(Long id);
	
}
