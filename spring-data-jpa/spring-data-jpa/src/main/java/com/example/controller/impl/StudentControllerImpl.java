<<<<<<< HEAD
package com.example.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.controller.IStudentController;
import com.example.dto.DtoStudent;
import com.example.dto.DtoStudentIU;
import com.example.services.IStudentService;

@RestController
@RequestMapping(path = "/rest/api/student")
public class StudentControllerImpl implements IStudentController{

	@Autowired
	private IStudentService service;
	
	// DTO KULLANILIR
	@Override
	@PostMapping(path = "/save")
	public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU) {
		return service.saveStudent(dtoStudentIU);
	}

	@Override
	@GetMapping(path = "/list/All")
	public List<DtoStudent> getAllStudent() {
		return service.getAllStudent();
	}

	@Override
	@GetMapping(path = "/list/{id}")
	public DtoStudent getStudent(@PathVariable(name = "id") Integer id) {
		return service.getStudent(id);
	}

	@Override
	@DeleteMapping(path = "/delete/{id}")
	public boolean deleteStudnet(@PathVariable(name = "id") Integer id) {
		return service.deleteStudent(id);
	}

	@Override
	@PutMapping(path = "/update/{id}")
	public DtoStudent updateStudent(@RequestBody DtoStudentIU dtoStudentIU,@PathVariable(name = "id") Integer id) {
		return service.updateStudent(dtoStudentIU, id);
	}
	


}
=======
package com.example.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.controller.IStudentController;
import com.example.dto.DtoStudent;
import com.example.dto.DtoStudentIU;
import com.example.services.IStudentService;

@RestController
@RequestMapping(path = "/rest/api/student")
public class StudentControllerImpl implements IStudentController{

	@Autowired
	private IStudentService service;
	
	// DTO KULLANILIR
	@Override
	@PostMapping(path = "/save")
	public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU) {
		return service.saveStudent(dtoStudentIU);
	}

	@Override
	@GetMapping(path = "/list/All")
	public List<DtoStudent> getAllStudent() {
		return service.getAllStudent();
	}

	@Override
	@GetMapping(path = "/list/{id}")
	public DtoStudent getStudent(@PathVariable(name = "id") Integer id) {
		return service.getStudent(id);
	}

	@Override
	@DeleteMapping(path = "/delete/{id}")
	public boolean deleteStudnet(@PathVariable(name = "id") Integer id) {
		return service.deleteStudent(id);
	}

	@Override
	@PutMapping(path = "/update/{id}")
	public DtoStudent updateStudent(@RequestBody DtoStudentIU dtoStudentIU,@PathVariable(name = "id") Integer id) {
		return service.updateStudent(dtoStudentIU, id);
	}
	


}
>>>>>>> main
