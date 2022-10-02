package com.sid.gestionStockNew.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "commande_fournisseur")
public class CommandeFournisseur extends AbstractEntity {
	@Column(name = "code_commande")
	private String codeCommande;
	
	@Column(name = "date_commande")
	private Instant dateCommande;
	
	@ManyToOne
	@JoinColumn(name = "fournisseur_id")
	private Fournisseur fournisseur;
	
	@OneToMany(mappedBy = "CommandeFournisseur")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
}
