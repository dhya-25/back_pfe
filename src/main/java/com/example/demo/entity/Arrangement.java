package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Arrangement {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String codArrangement;
	private Long rangArrangement;
	private String libArrangement;
	private String premierService;
	private String dernierService;
	private Long pdej;
	private Long dej;
	private Long din;
	private Long allInclusif;
	
	@OneToMany(mappedBy = "arrangement")
	private List<Resident> resident;

	public Arrangement(Long rangArrangement, String libArrangement, String premierService, String dernierService,
			Long pdej, Long dej, Long din, Long allInclusif, List<Resident> resident) {
		super();
		this.rangArrangement = rangArrangement;
		this.libArrangement = libArrangement;
		this.premierService = premierService;
		this.dernierService = dernierService;
		this.pdej = pdej;
		this.dej = dej;
		this.din = din;
		this.allInclusif = allInclusif;
		this.resident = resident;
	}

	public Arrangement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getRangArrangement() {
		return rangArrangement;
	}

	public void setRangArrangement(Long rangArrangement) {
		this.rangArrangement = rangArrangement;
	}

	public String getLibArrangement() {
		return libArrangement;
	}

	public void setLibArrangement(String libArrangement) {
		this.libArrangement = libArrangement;
	}

	public String getPremierService() {
		return premierService;
	}

	public void setPremierService(String premierService) {
		this.premierService = premierService;
	}

	public String getDernierService() {
		return dernierService;
	}

	public void setDernierService(String dernierService) {
		this.dernierService = dernierService;
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

	public Long getAllInclusif() {
		return allInclusif;
	}

	public void setAllInclusif(Long allInclusif) {
		this.allInclusif = allInclusif;
	}

	public List<Resident> getResident() {
		return resident;
	}

	public void setResident(List<Resident> resident) {
		this.resident = resident;
	}
	
	
	
	

}
