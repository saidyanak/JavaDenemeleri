<<<<<<< HEAD
package com.example.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.IAdressController;
import com.example.dto.DtoAdress;
import com.example.services.IAdressService;

@RestController
@RequestMapping(path = "/api/adress")
public class AdressControllerImpl implements IAdressController{

	@Autowired
	IAdressService iAdressService;
	
	@Override
	@GetMapping(path = "/{id}")
	public DtoAdress getByAdress(@PathVariable(name = "id") Long id) {
		return iAdressService.getByAdress(id);
	}

	
}
=======
package com.example.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.IAdressController;
import com.example.dto.DtoAdress;
import com.example.services.IAdressService;

@RestController
@RequestMapping(path = "/api/adress")
public class AdressControllerImpl implements IAdressController{

	@Autowired
	IAdressService iAdressService;
	
	@Override
	@GetMapping(path = "/{id}")
	public DtoAdress getByAdress(@PathVariable(name = "id") Long id) {
		return iAdressService.getByAdress(id);
	}

	
}
>>>>>>> main
