package com.example.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.IRoomController;
import com.example.dto.DtoRoom;
import com.example.services.IRoomService;

@RestController
@RequestMapping(path = "/api/room")
public class RoomController implements IRoomController{

	@Autowired
	IRoomService iRoomService;
	@Override
	@GetMapping(path = "/{id}")
	public DtoRoom getRoomById(@PathVariable(name = "id") Long id) {
		return iRoomService.getRoomById(id);
	}
	

}
