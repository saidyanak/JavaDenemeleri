package com.example.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.DtoAdress;
import com.example.dto.DtoCustomer;
import com.example.entities.Adress;
import com.example.repository.AdressRepository;
import com.example.services.IAdressService;

@Service
public class AdressService implements IAdressService {

	@Autowired
	AdressRepository adressRepository;

	@Override
	public DtoAdress getByAdress(Long id) {

		DtoAdress dtoAdress = new DtoAdress();
		DtoCustomer dtoCustomer = new DtoCustomer();

		Optional<Adress> optional = adressRepository.findById(id);
		Adress adress = optional.get();
		
		if (optional.isEmpty()) {
			return null;
		}
		
		BeanUtils.copyProperties(adress, dtoAdress);
		
		dtoCustomer.setId(adress.getCustomer().getId());
		dtoCustomer.setName(adress.getCustomer().getName());
		dtoAdress.setDtoCustomer(dtoCustomer);
		return dtoAdress;
	}

}
