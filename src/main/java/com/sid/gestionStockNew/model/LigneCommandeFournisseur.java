package com.sid.gestionStockNew.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

@AllArgsConstructor
@Entity
@Table(name = "ligne_commande_fournisseur")
public class LigneCommandeFournisseur extends AbstractEntity {
	@ManyToOne
	@JoinColumn(name = "article_id")
	private Article article;

	
	@ManyToOne
	@JoinColumn(name = "commande_fournisseur_id")
	private CommandeFournisseur commandeFournisseur;
}
