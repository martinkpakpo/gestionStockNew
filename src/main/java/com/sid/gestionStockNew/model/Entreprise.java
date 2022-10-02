package com.sid.gestionStockNew.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)

@Table(name = "entreprise")
public class Entreprise extends AbstractEntity {
	@Column(name = "name")
	private String name;
	
	@Embedded
	private Adresse adresse;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telephone")
	private String telephone;
}
