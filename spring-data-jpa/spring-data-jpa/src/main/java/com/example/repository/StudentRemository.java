package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Student;

@Repository
public interface StudentRemository extends JpaRepository<Student, Integer>{
	
}
