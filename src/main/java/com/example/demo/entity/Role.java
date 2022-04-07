package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Role")
public class Role {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private String idRole;
	
	private String libelle;
	
	private Long droitAcces;
	
	@OneToMany(mappedBy = "role")
	private List<Utilisateur> utilisateurs;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(String libelle, Long droitAcces, List<Utilisateur> utilisateurs) {
		super();
		this.libelle = libelle;
		this.droitAcces = droitAcces;
		this.utilisateurs = utilisateurs;
	}

	public String getIdRole() {
		return idRole;
	}

	public void setIdRole(String idRole) {
		this.idRole = idRole;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Long getDroitAcces() {
		return droitAcces;
	}

	public void setDroitAcces(Long droitAcces) {
		this.droitAcces = droitAcces;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", libelle=" + libelle + ", droitAcces=" + droitAcces + ", utilisateurs="
				+ utilisateurs + "]";
	}

	
	
	

}
