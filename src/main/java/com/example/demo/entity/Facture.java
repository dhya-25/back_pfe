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

@Entity
public class Facture {

	@Id
	@GeneratedValue /* strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR" */
	// @SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName =
	// "SEQ_CONTRATAGENCE", allocationSize = 1)

	private Long idFacture;
	@Temporal(TemporalType.DATE)
	private Date dateArr;
	@Temporal(TemporalType.DATE)
	private Date dateDep;
	private String commentaire;
	private Long mntHtax;
	private Long mntHtva;
	private Long mntFdcst;
	private Long tbreFiscal;
	private Long mntTtc;
	private String mntTtlettre;
	private String promotion;
	private Long nbrGratuit;
	private String typePaiment;
	@Temporal(TemporalType.DATE)
	private Date dateFacture;
	private String nomClient;
	private String typeFacture;

	@OneToMany(mappedBy = "facture")
	private List<Chambre> chambre;
	
	@OneToMany(mappedBy = "facture")
	private List<Consomation> consomation;

	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture(Date dateArr, Date dateDep, String commentaire, Long mntHtax, Long mntHtva, Long mntFdcst,
			Long tbreFiscal, Long mntTtc, String mntTtlettre, String promotion, Long nbrGratuit, String typePaiment,
			Date dateFacture, String nomClient, String typeFacture, List<Chambre> chambre,
			List<Consomation> consomation) {
		super();
		this.dateArr = dateArr;
		this.dateDep = dateDep;
		this.commentaire = commentaire;
		this.mntHtax = mntHtax;
		this.mntHtva = mntHtva;
		this.mntFdcst = mntFdcst;
		this.tbreFiscal = tbreFiscal;
		this.mntTtc = mntTtc;
		this.mntTtlettre = mntTtlettre;
		this.promotion = promotion;
		this.nbrGratuit = nbrGratuit;
		this.typePaiment = typePaiment;
		this.dateFacture = dateFacture;
		this.nomClient = nomClient;
		this.typeFacture = typeFacture;
		this.chambre = chambre;
		this.consomation = consomation;
	}

	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public Date getDateArr() {
		return dateArr;
	}

	public void setDateArr(Date dateArr) {
		this.dateArr = dateArr;
	}

	public Date getDateDep() {
		return dateDep;
	}

	public void setDateDep(Date dateDep) {
		this.dateDep = dateDep;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Long getMntHtax() {
		return mntHtax;
	}

	public void setMntHtax(Long mntHtax) {
		this.mntHtax = mntHtax;
	}

	public Long getMntHtva() {
		return mntHtva;
	}

	public void setMntHtva(Long mntHtva) {
		this.mntHtva = mntHtva;
	}

	public Long getMntFdcst() {
		return mntFdcst;
	}

	public void setMntFdcst(Long mntFdcst) {
		this.mntFdcst = mntFdcst;
	}

	public Long getTbreFiscal() {
		return tbreFiscal;
	}

	public void setTbreFiscal(Long tbreFiscal) {
		this.tbreFiscal = tbreFiscal;
	}

	public Long getMntTtc() {
		return mntTtc;
	}

	public void setMntTtc(Long mntTtc) {
		this.mntTtc = mntTtc;
	}

	public String getMntTtlettre() {
		return mntTtlettre;
	}

	public void setMntTtlettre(String mntTtlettre) {
		this.mntTtlettre = mntTtlettre;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public Long getNbrGratuit() {
		return nbrGratuit;
	}

	public void setNbrGratuit(Long nbrGratuit) {
		this.nbrGratuit = nbrGratuit;
	}

	public String getTypePaiment() {
		return typePaiment;
	}

	public void setTypePaiment(String typePaiment) {
		this.typePaiment = typePaiment;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getTypeFacture() {
		return typeFacture;
	}

	public void setTypeFacture(String typeFacture) {
		this.typeFacture = typeFacture;
	}

	public List<Chambre> getChambre() {
		return chambre;
	}

	public void setChambre(List<Chambre> chambre) {
		this.chambre = chambre;
	}

	public List<Consomation> getConsomation() {
		return consomation;
	}

	public void setConsomation(List<Consomation> consomation) {
		this.consomation = consomation;
	}

	
	

}
