package com.hilgo.kuryeisbul.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hilgo.kuryeisbul.Dto.AdvertsDto;
import com.hilgo.kuryeisbul.entity.Advert;
// import com.hilgo.kuryeisbul.entity.Dist;
import com.hilgo.kuryeisbul.repo.AdvertRepo;
@Service
public class AdvertService {

	@Autowired
	AdvertRepo advertRepo;
	
	
	public List<AdvertsDto> listAdverts()
	{
		List<Advert> adverts=  advertRepo.findAll();
		return adverts.stream()
				.map(advert -> new AdvertsDto(
						advert.getDist(),
						advert.getWorkingMethod(),
						advert.getDepartman(),
						advert.getDescription()
						))
						.collect(Collectors.toList());
	}
	
	
	
}