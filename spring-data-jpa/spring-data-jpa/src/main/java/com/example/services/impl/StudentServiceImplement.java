package com.example.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.DtoStudent;
import com.example.dto.DtoStudentIU;
import com.example.entities.Student;
import com.example.repository.StudentRemository;
import com.example.services.IStudentService;


@Service
public class StudentServiceImplement implements IStudentService{

	@Autowired
	private StudentRemository studentRemository;
	
	@Override
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
		Student student = new Student();
		DtoStudent dtoStudent = new DtoStudent();
		BeanUtils.copyProperties(dtoStudentIU, student);
		studentRemository.save(student);
		BeanUtils.copyProperties(student, dtoStudent);
		return dtoStudent;
	}

	@Override
	public List<DtoStudent> getAllStudent() {
		List<Student> responseStudents = new ArrayList<Student>();
		responseStudents = studentRemository.findAll();
		List<DtoStudent> dtoStudents = new ArrayList<DtoStudent>();
		for (Student student : responseStudents) {
			DtoStudent saveDtoStudent = new DtoStudent();
			saveDtoStudent.setFirstName(student.getFirstName());
			saveDtoStudent.setLastName(student.getLastName());
			dtoStudents.add(saveDtoStudent);
		}
		return dtoStudents;
	}

	@Override
	public DtoStudent getStudent(Integer id) {
		
		Optional<Student> optionalStudent= studentRemository.findById(id);
		
		if (optionalStudent.isPresent()) {
			Student student = optionalStudent.get();
			DtoStudent dtoStudent = new DtoStudent();
			BeanUtils.copyProperties(student, dtoStudent);
			return dtoStudent;
		}
		return null;
	}

	@Override
	public boolean deleteStudent(Integer id) {
		studentRemository.deleteById(id);
		return false;
	}

	@Override
	public DtoStudent updateStudent(DtoStudentIU dtoStudentIU, Integer id)
	{
		DtoStudent dtoStudent = new DtoStudent();
		Optional<Student> student = studentRemository.findById(id);
		Student student2 = student.get();
		if (student.isPresent()) {
			BeanUtils.copyProperties(dtoStudentIU, student2);
			studentRemository.save(student2);
			BeanUtils.copyProperties(student2, dtoStudent);
			return dtoStudent;
		}
		return null;
	}
}
