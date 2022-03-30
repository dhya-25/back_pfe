package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Consomation {

	

	@Id
	@GeneratedValue/*strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR"*/
	//@SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName = "SEQ_CONSOMMATION", allocationSize = 1)
	
	private Long idConsommation;
	
	private Long mnt_Conso;
	@Temporal(TemporalType.DATE)
	private Date date_Conso;
	
	private String heure_conso;
	
	private String num_bon;
	private String type_conso;
	@Temporal(TemporalType.DATE)
	private Date date_sys;
	
	private String offre;
	private String type_client;
	private Long num_fact_ind;
	private Long num_fact_deb;
	private String forfait;
	private String code_dev;
	private Long taux_dev;
	private Long unite;
	
	@OneToMany(mappedBy = "consomation")
	private List<Resident> residents;
	
	@ManyToOne
	private Facture facture;
	
	@ManyToOne
	private Prestation prestation;
	
	public Consomation( Long mnt_Conso, Date date_Conso, String heure_conso, String num_bon,
			String type_conso, Date date_sys, String offre, String type_client, Long num_fact_ind, Long num_fact_deb,
			String forfait, String code_dev, Long taux_dev, Long unite, List<Resident> residents) {
		super();
		this.mnt_Conso = mnt_Conso;
		this.date_Conso = date_Conso;
		this.heure_conso = heure_conso;
		this.num_bon = num_bon;
		this.type_conso = type_conso;
		this.date_sys = date_sys;
		this.offre = offre;
		this.type_client = type_client;
		this.num_fact_ind = num_fact_ind;
		this.num_fact_deb = num_fact_deb;
		this.forfait = forfait;
		this.code_dev = code_dev;
		this.taux_dev = taux_dev;
		this.unite = unite;
		this.residents = residents;
	}
	public Consomation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Resident> getResidents() {
		return residents;
	}
	public void setResidents(List<Resident> residents) {
		this.residents = residents;
	}
	public Long getIdConsommation() {
		return idConsommation;
	}
	public void setIdConsommation(Long idConsommation) {
		this.idConsommation = idConsommation;
	}
	public Long getMnt_Conso() {
		return mnt_Conso;
	}
	public void setMnt_Conso(Long mnt_Conso) {
		this.mnt_Conso = mnt_Conso;
	}
	public Date getDate_Conso() {
		return date_Conso;
	}
	public void setDate_Conso(Date date_Conso) {
		this.date_Conso = date_Conso;
	}
	public String getHeure_conso() {
		return heure_conso;
	}
	public void setHeure_conso(String heure_conso) {
		this.heure_conso = heure_conso;
	}
	public String getNum_bon() {
		return num_bon;
	}
	public void setNum_bon(String num_bon) {
		this.num_bon = num_bon;
	}
	public String getType_conso() {
		return type_conso;
	}
	public void setType_conso(String type_conso) {
		this.type_conso = type_conso;
	}
	public Date getDate_sys() {
		return date_sys;
	}
	public void setDate_sys(Date date_sys) {
		this.date_sys = date_sys;
	}
	public String getOffre() {
		return offre;
	}
	public void setOffre(String offre) {
		this.offre = offre;
	}
	public String getType_client() {
		return type_client;
	}
	public void setType_client(String type_client) {
		this.type_client = type_client;
	}
	public Long getNum_fact_ind() {
		return num_fact_ind;
	}
	public void setNum_fact_ind(Long num_fact_ind) {
		this.num_fact_ind = num_fact_ind;
	}
	public Long getNum_fact_deb() {
		return num_fact_deb;
	}
	public void setNum_fact_deb(Long num_fact_deb) {
		this.num_fact_deb = num_fact_deb;
	}
	public String getForfait() {
		return forfait;
	}
	public void setForfait(String forfait) {
		this.forfait = forfait;
	}
	public String getCode_dev() {
		return code_dev;
	}
	public void setCode_dev(String code_dev) {
		this.code_dev = code_dev;
	}
	public Long getTaux_dev() {
		return taux_dev;
	}
	public void setTaux_dev(Long taux_dev) {
		this.taux_dev = taux_dev;
	}
	public Long getUnite() {
		return unite;
	}
	public void setUnite(Long unite) {
		this.unite = unite;
	}
	
	

	


	
}
