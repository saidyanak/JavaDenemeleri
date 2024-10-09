package com.example.services;

import java.util.List;
import com.example.dto.DtoStudent;
import com.example.dto.DtoStudentIU;

public interface IStudentService {
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	
	public List<DtoStudent> getAllStudent();
	
	public DtoStudent getStudent(Integer id);
	
	public boolean deleteStudent(Integer id);
	
	public DtoStudent updateStudent(DtoStudentIU dtoStudentIU, Integer id); 
}
