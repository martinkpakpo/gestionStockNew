package com.sid.gestionStockNew.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)

@Table(name = "ligne_vente")
public class LigneVente extends AbstractEntity {
	@ManyToOne
	@JoinColumn(name = "vente_id")
	private Article vente;
	
	@ManyToOne
	@JoinColumn(name = "article_id")
	private Article article;
	
	private BigDecimal quantite;
	
}
