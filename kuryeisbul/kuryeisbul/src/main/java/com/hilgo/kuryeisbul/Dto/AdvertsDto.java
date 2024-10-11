package com.hilgo.kuryeisbul.Dto;

import com.hilgo.kuryeisbul.entity.Departman;
import com.hilgo.kuryeisbul.entity.Dist;
import com.hilgo.kuryeisbul.entity.WorkingMethod;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdvertsDto {

	private Dist dist;
	
	private WorkingMethod workingMethod;
	
	private Departman departman;
	
	private String description;
	
	
}
