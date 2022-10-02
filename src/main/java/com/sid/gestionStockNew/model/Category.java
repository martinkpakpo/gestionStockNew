package com.sid.gestionStockNew.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)

@Table(name = "category")
public class Category extends AbstractEntity {
	
	@Column(name = "code_category")
	private String codeCategory;
	
	@Column(name = "designeation")
	private String designation;
	
	@OneToMany(mappedBy = "category")
	private List<Article> articles;
}
