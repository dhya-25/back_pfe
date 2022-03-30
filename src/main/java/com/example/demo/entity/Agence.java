package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Agence {

	
	@Id
	@GeneratedValue/*strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR"*/
//	@SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName = "SEQ_AGENCE", allocationSize = 1)
	
	private Long idAgence;
	
	private String nom_Agence; 
	private String adr_One_Agence;
	private String adr_Two_Agence;
	private String adr_Tree_Agence;
	private String tel_Agence;
	private String fax_Agence;
	private String telex_Agence;
	private String representant;
	private String domi_Agence;
	private String type_Agence;
	private String cpte_Agence;
	private String etat_Agence;
	private String site_Web;
	private String email;
	private String nom_Comercial;
	private String pays_Agence;
	private String province_Agence;
	
	@OneToMany(mappedBy = "agence")
	private List<Reservation> reservations;
	

	
	public List<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	public long getIdAgence() {
		return idAgence;
	}
	public void setIdAgence(Long idAgence) {
		this.idAgence = idAgence;
	}
	public String getNom_Agence() {
		return nom_Agence;
	}
	public void setNom_Agence(String nom_Agence) {
		this.nom_Agence = nom_Agence;
	}
	public String getAdr_One_Agence() {
		return adr_One_Agence;
	}
	public void setAdr_One_Agence(String adr_One_Agence) {
		this.adr_One_Agence = adr_One_Agence;
	}
	public String getAdr_Two_Agence() {
		return adr_Two_Agence;
	}
	public void setAdr_Two_Agence(String adr_Two_Agence) {
		this.adr_Two_Agence = adr_Two_Agence;
	}
	public String getAdr_Tree_Agence() {
		return adr_Tree_Agence;
	}
	public void setAdr_Tree_Agence(String adr_Tree_Agence) {
		this.adr_Tree_Agence = adr_Tree_Agence;
	}
	public String getTel_Agence() {
		return tel_Agence;
	}
	public void setTel_Agence(String tel_Agence) {
		this.tel_Agence = tel_Agence;
	}
	public String getFax_Agence() {
		return fax_Agence;
	}
	public void setFax_Agence(String fax_Agence) {
		this.fax_Agence = fax_Agence;
	}
	public String getTelex_Agence() {
		return telex_Agence;
	}
	public void setTelex_Agence(String telex_Agence) {
		this.telex_Agence = telex_Agence;
	}
	public String getRepresentant() {
		return representant;
	}
	public void setRepresentant(String representant) {
		this.representant = representant;
	}
	public String getDomi_Agence() {
		return domi_Agence;
	}
	public void setDomi_Agence(String domi_Agence) {
		this.domi_Agence = domi_Agence;
	}
	public String getType_Agence() {
		return type_Agence;
	}
	public void setType_Agence(String type_Agence) {
		this.type_Agence = type_Agence;
	}
	public String getCpte_Agence() {
		return cpte_Agence;
	}
	public void setCpte_Agence(String cpte_Agence) {
		this.cpte_Agence = cpte_Agence;
	}
	public String getEtat_Agence() {
		return etat_Agence;
	}
	public void setEtat_Agence(String etat_Agence) {
		this.etat_Agence = etat_Agence;
	}
	public String getSite_Web() {
		return site_Web;
	}
	public void setSite_Web(String site_Web) {
		this.site_Web = site_Web;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNom_Comercial() {
		return nom_Comercial;
	}
	public void setNom_Comercial(String nom_Comercial) {
		this.nom_Comercial = nom_Comercial;
	}
	public String getPays_Agence() {
		return pays_Agence;
	}
	public void setPays_Agence(String pays_Agence) {
		this.pays_Agence = pays_Agence;
	}
	public String getProvince_Agence() {
		return province_Agence;
	}
	public void setProvince_Agence(String province_Agence) {
		this.province_Agence = province_Agence;
	}
	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agence(String nom_Agence, String adr_One_Agence, String adr_Two_Agence, String adr_Tree_Agence,
			String tel_Agence, String fax_Agence, String telex_Agence, String representant, String domi_Agence,
			String type_Agence, String cpte_Agence, String etat_Agence, String site_Web, String email,
			String nom_Comercial, String pays_Agence, String province_Agence, List<Reservation> reservations) {
		super();
		this.nom_Agence = nom_Agence;
		this.adr_One_Agence = adr_One_Agence;
		this.adr_Two_Agence = adr_Two_Agence;
		this.adr_Tree_Agence = adr_Tree_Agence;
		this.tel_Agence = tel_Agence;
		this.fax_Agence = fax_Agence;
		this.telex_Agence = telex_Agence;
		this.representant = representant;
		this.domi_Agence = domi_Agence;
		this.type_Agence = type_Agence;
		this.cpte_Agence = cpte_Agence;
		this.etat_Agence = etat_Agence;
		this.site_Web = site_Web;
		this.email = email;
		this.nom_Comercial = nom_Comercial;
		this.pays_Agence = pays_Agence;
		this.province_Agence = province_Agence;
		this.reservations = reservations;
	}
	







	
	}
