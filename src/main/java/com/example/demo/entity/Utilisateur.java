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

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "Utilisateur")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codeUtilisateur;
	private String nomUser;
	private String password;
	private String matPers;
	private Long dureeAcc;
	private String adresse;
	private String tel;
	private String cin;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date dateDeb;
	private String ref;

	@ManyToOne
	private Role role;
	

	public Utilisateur() {

	}


	public Utilisateur(String nomUser, String password, String matPers, Long dureeAcc, String adresse, String tel,
			String cin, Date dateDeb, String ref, Role role) {
		super();
		this.nomUser = nomUser;
		this.password = password;
		this.matPers = matPers;
		this.dureeAcc = dureeAcc;
		this.adresse = adresse;
		this.tel = tel;
		this.cin = cin;
		this.dateDeb = dateDeb;
		this.ref = ref;
		this.role = role;
	}


	public String getCodeUtilisateur() {
		return codeUtilisateur;
	}


	public void setCodeUtilisateur(String codeUtilisateur) {
		this.codeUtilisateur = codeUtilisateur;
	}


	public String getNomUser() {
		return nomUser;
	}


	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMatPers() {
		return matPers;
	}


	public void setMatPers(String matPers) {
		this.matPers = matPers;
	}


	public Long getDureeAcc() {
		return dureeAcc;
	}


	public void setDureeAcc(Long dureeAcc) {
		this.dureeAcc = dureeAcc;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getCin() {
		return cin;
	}


	public void setCin(String cin) {
		this.cin = cin;
	}


	public Date getDateDeb() {
		return dateDeb;
	}


	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}


	public String getRef() {
		return ref;
	}


	public void setRef(String ref) {
		this.ref = ref;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Utilisateur [codeUtilisateur=" + codeUtilisateur + ", nomUser=" + nomUser + ", password=" + password
				+ ", matPers=" + matPers + ", dureeAcc=" + dureeAcc + ", adresse=" + adresse + ", tel=" + tel + ", cin="
				+ cin + ", dateDeb=" + dateDeb + ", ref=" + ref + ", role=" + role + "]";
	}

	

}
