package com.sid.gestionStockNew.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "article")
public class Article extends AbstractEntity {
	@Column(name = "code_article")
	private String codeArticle;

	@Column(name = "designeation")
	private String designation;
	
	@Column(name = "prix_unitaire_ht")
	private BigDecimal prixUnitaireHt;
	

	@Column(name = "taux_tva")
	private BigDecimal TauxTva;
	

	@Column(name = "prix_unitaire_ttc")
	private BigDecimal prixUnitaireTtc;
	
	@Column(name = "photo")
	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
}
