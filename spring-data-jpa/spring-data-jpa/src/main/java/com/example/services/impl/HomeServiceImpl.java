package com.example.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.DtoHome;
import com.example.dto.DtoRoom;
import com.example.entities.Home;
import com.example.entities.Room;
import com.example.repository.HomeRepository;
import com.example.services.IHomeService;

@Service
public class HomeServiceImpl implements IHomeService {

	@Autowired
	HomeRepository homeRepository;

	@Override
	public DtoHome getHomeById(Long id) {
		DtoHome dtoHome = new DtoHome();
		Optional<Home> optional = homeRepository.findById(id);
		Home home = optional.get();
		if (optional.isEmpty()) {
			return null;
		}
		BeanUtils.copyProperties(home, dtoHome);
		if (home.getRoom().isEmpty()) {
			return null;
		}
		List<Room> rooms = home.getRoom();
		for (Room room : rooms) {
			DtoRoom dtoRoom = new DtoRoom();
			BeanUtils.copyProperties(room, dtoRoom);
			dtoHome.getRoom().add(dtoRoom);
		}
		return dtoHome;
	}

	@Override
	public List<DtoHome> getAllHome() {
		List<Home> allHome = homeRepository.findAll();
		List<DtoHome> dtoHome = new ArrayList<DtoHome>();
		if (allHome.isEmpty()) {
			return null;
		}

		for (Home home : allHome) {

			DtoHome dtoHomee = new DtoHome(); // DtoHome nesnesini oluştur

			List<Room> rooms = home.getRoom();

			List<DtoRoom> dtoRooms = new ArrayList<DtoRoom>();

			BeanUtils.copyProperties(home, dtoHomee); // Home nesnesinin özelliklerini dto'ya kopyala

			for (Room room : rooms) {
				DtoRoom newDtoRoom = new DtoRoom();
				BeanUtils.copyProperties(room, newDtoRoom);
				dtoRooms.add(newDtoRoom);
			}
			dtoHomee.setRoom(dtoRooms);
			dtoHome.add(dtoHomee);
		}
		return dtoHome;
	}
}
