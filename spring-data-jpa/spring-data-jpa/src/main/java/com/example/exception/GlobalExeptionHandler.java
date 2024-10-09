package com.example.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // exeptionHendler Sınıfı olarak söyledim
public class GlobalExeptionHandler {
	
	
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public void hendleMethotArgumentNotValidExeption(MethodArgumentNotValidException ex)
	{
		
	}
}
