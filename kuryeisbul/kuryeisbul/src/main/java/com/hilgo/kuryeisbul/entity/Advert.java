package com.hilgo.kuryeisbul.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "advert")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Advert {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@ManyToOne
	private Dist dist;
	
	@ManyToOne
	private WorkingMethod workingMethod;
	
	@ManyToOne
	private Departman departman;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "basvuru_sayisi")
	private Long basvuruSayisi;
	
}
