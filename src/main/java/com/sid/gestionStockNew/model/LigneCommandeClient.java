package com.sid.gestionStockNew.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)

@Table(name = "ligne_commande_client")
public class LigneCommandeClient extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "article_id")
	private Article article;
	
	
	@ManyToOne
	@JoinColumn(name = "commande_client_id")
	private CommandeClient commandeClients;
}


