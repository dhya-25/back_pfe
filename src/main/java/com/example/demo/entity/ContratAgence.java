package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ContratAgence {
	@Id
	@GeneratedValue/*strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR"*/
	//@SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName = "SEQ_CONTRATAGENCE", allocationSize = 1)
	
	private Long idContartAgence;
	
	@Temporal(TemporalType.DATE)
	private Date date_contrat;
	private Long cpde_periode;
	private String code_tarif;

	private String code_reduction;	
	private String code_supplement;
	private Long prix_reduction;
	private Long prix_arragement;
	private Long valeur_supp;

	
	public Long getIdContartAgence() {
		return idContartAgence;
	}
	public void setIdContartAgence(Long idContartAgence) {
		this.idContartAgence = idContartAgence;
	}
	public Date getDate_contrat() {
		return date_contrat;
	}
	public void setDate_contrat(Date date_contrat) {
		this.date_contrat = date_contrat;
	}
	public Long getCpde_periode() {
		return cpde_periode;
	}
	public void setCpde_periode(Long cpde_periode) {
		this.cpde_periode = cpde_periode;
	}
	public String getCode_tarif() {
		return code_tarif;
	}
	public void setCode_tarif(String code_tarif) {
		this.code_tarif = code_tarif;
	}

	public String getCode_reduction() {
		return code_reduction;
	}
	public void setCode_reduction(String code_reduction) {
		this.code_reduction = code_reduction;
	}
	public String getCode_supplement() {
		return code_supplement;
	}
	public void setCode_supplement(String code_supplement) {
		this.code_supplement = code_supplement;
	}
	public Long getPrix_reduction() {
		return prix_reduction;
	}
	public void setPrix_reduction(Long prix_reduction) {
		this.prix_reduction = prix_reduction;
	}
	public Long getPrix_arragement() {
		return prix_arragement;
	}
	public void setPrix_arragement(Long prix_arragement) {
		this.prix_arragement = prix_arragement;
	}
	public Long getValeur_supp() {
		return valeur_supp;
	}
	public void setValeur_supp(Long valeur_supp) {
		this.valeur_supp = valeur_supp;
	}
	public ContratAgence(Long idContartAgence, Date date_contrat, Long cpde_periode, String code_tarif,
			 String code_reduction, String code_supplement, Long prix_reduction,
			Long prix_arragement, Long valeur_supp) {
		super();
		this.idContartAgence = idContartAgence;
		this.date_contrat = date_contrat;
		this.cpde_periode = cpde_periode;
		this.code_tarif = code_tarif;
		this.code_reduction = code_reduction;
		this.code_supplement = code_supplement;
		this.prix_reduction = prix_reduction;
		this.prix_arragement = prix_arragement;
		this.valeur_supp = valeur_supp;
	}
	public ContratAgence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

;

}
