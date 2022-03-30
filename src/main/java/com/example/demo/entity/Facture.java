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
	private Date date_arr;
	@Temporal(TemporalType.DATE)
	private Date date_dep;
	private String commentaire;
	private Long mnt_htax;
	private Long mnt_htva;
	private Long mnt_fdcst;
	private Long tbre_fiscal;
	private Long mnt_ttc;
	private String mnt_ttlettre;
	private String promotion;
	private Long nbr_gratuit;
	private String type_paiment;
	@Temporal(TemporalType.DATE)
	private Date date_facture;
	private String nom_client;
	private String type_facture;

	@OneToMany(mappedBy = "facture")
	private List<Chambre> chambre;
	
	@OneToMany(mappedBy = "facture")
	private List<Consomation> consomation;

	
	public Facture(Date date_arr, Date date_dep, String commentaire, Long mnt_htax, Long mnt_htva, Long mnt_fdcst,
			Long tbre_fiscal, Long mnt_ttc, String mnt_ttlettre, String promotion, Long nbr_gratuit,
			String type_paiment, Date date_facture, String nom_client, String type_facture, List<Chambre> chambre,
			List<Consomation> consomation) {
		super();
		this.date_arr = date_arr;
		this.date_dep = date_dep;
		this.commentaire = commentaire;
		this.mnt_htax = mnt_htax;
		this.mnt_htva = mnt_htva;
		this.mnt_fdcst = mnt_fdcst;
		this.tbre_fiscal = tbre_fiscal;
		this.mnt_ttc = mnt_ttc;
		this.mnt_ttlettre = mnt_ttlettre;
		this.promotion = promotion;
		this.nbr_gratuit = nbr_gratuit;
		this.type_paiment = type_paiment;
		this.date_facture = date_facture;
		this.nom_client = nom_client;
		this.type_facture = type_facture;
		this.chambre = chambre;
		this.consomation = consomation;
	}
	

	public List<Consomation> getConsomation() {
		return consomation;
	}


	public void setConsomation(List<Consomation> consomation) {
		this.consomation = consomation;
	}


	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public Date getDate_arr() {
		return date_arr;
	}

	public void setDate_arr(Date date_arr) {
		this.date_arr = date_arr;
	}

	public Date getDate_dep() {
		return date_dep;
	}

	public void setDate_dep(Date date_dep) {
		this.date_dep = date_dep;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Long getMnt_htax() {
		return mnt_htax;
	}

	public void setMnt_htax(Long mnt_htax) {
		this.mnt_htax = mnt_htax;
	}

	public Long getMnt_htva() {
		return mnt_htva;
	}

	public void setMnt_htva(Long mnt_htva) {
		this.mnt_htva = mnt_htva;
	}

	public Long getMnt_fdcst() {
		return mnt_fdcst;
	}

	public void setMnt_fdcst(Long mnt_fdcst) {
		this.mnt_fdcst = mnt_fdcst;
	}

	public Long getTbre_fiscal() {
		return tbre_fiscal;
	}

	public void setTbre_fiscal(Long tbre_fiscal) {
		this.tbre_fiscal = tbre_fiscal;
	}

	public Long getMnt_ttc() {
		return mnt_ttc;
	}

	public void setMnt_ttc(Long mnt_ttc) {
		this.mnt_ttc = mnt_ttc;
	}

	public String getMnt_ttlettre() {
		return mnt_ttlettre;
	}

	public void setMnt_ttlettre(String mnt_ttlettre) {
		this.mnt_ttlettre = mnt_ttlettre;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public Long getNbr_gratuit() {
		return nbr_gratuit;
	}

	public void setNbr_gratuit(Long nbr_gratuit) {
		this.nbr_gratuit = nbr_gratuit;
	}

	public String getType_paiment() {
		return type_paiment;
	}

	public void setType_paiment(String type_paiment) {
		this.type_paiment = type_paiment;
	}

	public Date getDate_facture() {
		return date_facture;
	}

	public void setDate_facture(Date date_facture) {
		this.date_facture = date_facture;
	}

	public String getNom_client() {
		return nom_client;
	}

	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}

	public String getType_facture() {
		return type_facture;
	}

	public void setType_facture(String type_facture) {
		this.type_facture = type_facture;
	}

	public List<Chambre> getChambre() {
		return chambre;
	}

	public void setChambre(List<Chambre> chambre) {
		this.chambre = chambre;
	}

}
