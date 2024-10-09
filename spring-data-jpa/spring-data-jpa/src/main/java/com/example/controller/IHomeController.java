package com.example.controller;

import java.util.List;

import com.example.dto.DtoHome;

public interface IHomeController {
	public DtoHome getHomeById(Long id);
	public List<DtoHome> getAllHome();
}
