package com.example.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.IHomeController;
import com.example.dto.DtoHome;
import com.example.services.IHomeService;

@RestController
@RequestMapping(path = "/api/home")
public class HomeController implements IHomeController{

	@Autowired
	IHomeService homeService ;
	@Override
	@GetMapping(path = "/{id}")
	public DtoHome getHomeById(@PathVariable(name = "id") Long id) {
		return homeService.getHomeById(id);
	}
	@Override
	@GetMapping(path = "/all")
	public List<DtoHome> getAllHome() {
		return homeService.getAllHome();
	}

}
