package com.example.demo.entity;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Etat_Chambre {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	
	private String etatChambre;
	private String codColor;
	private String libEtat;

	
	@OneToMany(mappedBy = "etat_Chambre")
	private List<TypeChambre> typeChambres;


	public Etat_Chambre() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Etat_Chambre(String etatChambre, String codColor, String libEtat, List<TypeChambre> typeChambres) {
		super();
		this.etatChambre = etatChambre;
		this.codColor = codColor;
		this.libEtat = libEtat;
		this.typeChambres = typeChambres;
	}


	public String getEtatChambre() {
		return etatChambre;
	}


	public void setEtatChambre(String etatChambre) {
		this.etatChambre = etatChambre;
	}


	public String getCodColor() {
		return codColor;
	}


	public void setCodColor(String codColor) {
		this.codColor = codColor;
	}


	public String getLibEtat() {
		return libEtat;
	}


	public void setLibEtat(String libEtat) {
		this.libEtat = libEtat;
	}


	public List<TypeChambre> getTypeChambres() {
		return typeChambres;
	}


	public void setTypeChambres(List<TypeChambre> typeChambres) {
		this.typeChambres = typeChambres;
	}
	

	
	
	

	
	
}
