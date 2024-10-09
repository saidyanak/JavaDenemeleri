package com.example.services;

import java.util.List;

import com.example.dto.DtoHome;

public interface IHomeService {
	public DtoHome getHomeById(Long id);
	public List<DtoHome> getAllHome();
}
