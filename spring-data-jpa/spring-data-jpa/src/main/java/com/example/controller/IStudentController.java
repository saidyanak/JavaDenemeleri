package com.example.controller;

import java.util.List;

import com.example.dto.DtoStudent;
import com.example.dto.DtoStudentIU;

public interface IStudentController {
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	
	public List<DtoStudent> getAllStudent();
	
	public DtoStudent getStudent(Integer id);
	
	public boolean deleteStudnet(Integer id);
	
	public DtoStudent updateStudent(DtoStudentIU dtoStudentIU, Integer id);
}
