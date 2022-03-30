package com.example.demo.entity;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Etat_Chambre {

	@Id
	@GeneratedValue
	
	private String etat_chambre;
	private String cod_color;
	private String lib_etat;

	
	@OneToMany(mappedBy = "etat_Chambre")
	private List<TypeChambre> typeChambres;
	

	
	
	

	public String getEtat_chambre() {
		return etat_chambre;
	}
	public void setEtat_chambre(String etat_chambre) {
		this.etat_chambre = etat_chambre;
	}
	public String getCod_color() {
		return cod_color;
	}
	public void setCod_color(String cod_color) {
		this.cod_color = cod_color;
	}
	public String getLib_etat() {
		return lib_etat;
	}
	public void setLib_etat(String lib_etat) {
		this.lib_etat = lib_etat;
	}
	

	
}
