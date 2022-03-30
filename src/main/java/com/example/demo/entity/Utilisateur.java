package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String code_utilisateur;
	private String nom_user;
	private String password;
	private String mat_pers;
	private Long duree_acc;
	private String adresse;
	private String tel;
	private String cin;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date date_deb;
	

	public Utilisateur() {

	}

	public Utilisateur(String nom_user, String password, String mat_pers, Long duree_acc, String adresse, String tel,
			String cin, Date date_deb, List<Resident> residents) {
		super();
		this.nom_user = nom_user;
		this.password = password;
		this.mat_pers = mat_pers;
		this.duree_acc = duree_acc;
		this.adresse = adresse;
		this.tel = tel;
		this.cin = cin;
		this.date_deb = date_deb;
		//this.residents = residents;
	}

	public String getNom_user() {
		return nom_user;
	}

	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMat_pers() {
		return mat_pers;
	}

	public void setMat_pers(String mat_pers) {
		this.mat_pers = mat_pers;
	}

	public Long getDuree_acc() {
		return duree_acc;
	}

	public void setDuree_acc(Long duree_acc) {
		this.duree_acc = duree_acc;
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

	public Date getDate_deb() {
		return date_deb;
	}

	public void setDate_deb(Date date_deb) {
		this.date_deb = date_deb;
	}

	

	@Override
	public String toString() {
		return "Utilisateur [code_utilisateur=" + code_utilisateur + ", nom_user=" + nom_user + ", password=" + password
				+ ", mat_pers=" + mat_pers + ", duree_acc=" + duree_acc + ", adresse=" + adresse + ", tel=" + tel
				+ ", cin=" + cin + ", date_deb=" + date_deb + "]";
	}

}
