package com.example.services;

import com.example.dto.DtoAdress;

public interface IAdressService {
	
	DtoAdress getByAdress(Long id);
	
}
