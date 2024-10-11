package com.hilgo.kuryeisbul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hilgo.kuryeisbul.Dto.AdvertsDto;
import com.hilgo.kuryeisbul.service.AdvertService;

@RestController
@RequestMapping(path = "/api")
public class AdvertController {

	@Autowired
	AdvertService advertService;
	
	@GetMapping(path  = "/List/AllAdvert")
	public List<AdvertsDto> listAdverts()
	{
		return advertService.listAdverts();
	}
	
}
