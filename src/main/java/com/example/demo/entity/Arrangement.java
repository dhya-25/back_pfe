package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Arrangement {
	
	@Id
	@GeneratedValue
	private String cod_arrangement;
	private Long rang_arrangement;
	private String lib_arrangement;
	private String premier_service;
	private String dernier_service;
	private Long pdej;
	private Long dej;
	private Long din;
	private Long all_inclusif;
	
	@OneToMany(mappedBy = "arrangement")
	private List<Resident> resident;
	
	
	public Arrangement(Long rang_arrangement, String lib_arrangement, String premier_service, String dernier_service,
			Long pdej, Long dej, Long din, Long all_inclusif, List<Resident> resident) {
		super();
		this.rang_arrangement = rang_arrangement;
		this.lib_arrangement = lib_arrangement;
		this.premier_service = premier_service;
		this.dernier_service = dernier_service;
		this.pdej = pdej;
		this.dej = dej;
		this.din = din;
		this.all_inclusif = all_inclusif;
		this.resident = resident;
	}
	public Arrangement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getRang_arrangement() {
		return rang_arrangement;
	}
	public void setRang_arrangement(Long rang_arrangement) {
		this.rang_arrangement = rang_arrangement;
	}
	public String getLib_arrangement() {
		return lib_arrangement;
	}
	public void setLib_arrangement(String lib_arrangement) {
		this.lib_arrangement = lib_arrangement;
	}
	public String getPremier_service() {
		return premier_service;
	}
	public void setPremier_service(String premier_service) {
		this.premier_service = premier_service;
	}
	public String getDernier_service() {
		return dernier_service;
	}
	public void setDernier_service(String dernier_service) {
		this.dernier_service = dernier_service;
	}
	public Long getPdej() {
		return pdej;
	}
	public void setPdej(Long pdej) {
		this.pdej = pdej;
	}
	public Long getDej() {
		return dej;
	}
	public void setDej(Long dej) {
		this.dej = dej;
	}
	public Long getDin() {
		return din;
	}
	public void setDin(Long din) {
		this.din = din;
	}
	public Long getAll_inclusif() {
		return all_inclusif;
	}
	public void setAll_inclusif(Long all_inclusif) {
		this.all_inclusif = all_inclusif;
	}
	public String getCod_arrangement() {
		return cod_arrangement;
	}
	public void setCod_arrangement(String cod_arrangement) {
		this.cod_arrangement = cod_arrangement;
	}
	public List<Resident> getResident() {
		return resident;
	}
	public void setResident(List<Resident> resident) {
		this.resident = resident;
	}




	
	
	

}
