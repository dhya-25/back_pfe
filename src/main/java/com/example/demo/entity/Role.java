package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Role")
public class Role {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private String id_role;
	
	private String libelle;
	
	private Long droit_acces;

	public String getId_role() {
		return id_role;
	}

	public void setId_role(String id_role) {
		this.id_role = id_role;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Long getDroit_acces() {
		return droit_acces;
	}

	public void setDroit_acces(Long droit_acces) {
		this.droit_acces = droit_acces;
	}
	
	

	public Role(String id_role, String libelle, Long droit_acces) {
		super();
		this.id_role = id_role;
		this.libelle = libelle;
		this.droit_acces = droit_acces;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Role [id_role=" + id_role + ", libelle=" + libelle + ", droit_acces=" + droit_acces + "]";
	}
	
	
	
	

}
