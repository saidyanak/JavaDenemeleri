package com.hilgo.kuryeisbul.entity;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "advert_apply")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertApply {
	
	@Id
	@ManyToOne
	private Advert advert;
	
	@ManyToMany
	private List<Employee> employee;
}
