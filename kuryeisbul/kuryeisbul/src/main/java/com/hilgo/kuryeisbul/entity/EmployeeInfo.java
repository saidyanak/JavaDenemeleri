package com.hilgo.kuryeisbul.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false )
	private Long id;
	
	@Column(name = "name")
	private String name;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "tc")
	private Long tc;
	@Column(name = "ehliyet_sinifi")
	private String ehliyetSinifi;
	@Column(name = "telefon")
	private String telefon;
	@Column(name = "mail")
	private String mail;
	@Column(name = "date_day")
	private Date	dateDay;
	@Column(name = "password")
	private String password;
	
	
	
	
	
	
	
	
	
	
}
