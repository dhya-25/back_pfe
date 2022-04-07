package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class TypeChambre {
	
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")/*strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR"*/
	//@SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName = "SEQ_CONTRATAGENCE", allocationSize = 1)
	private String code_categ;
	
	private String commentaire;
	private Long television;
	private String telephone;
	private String climant;
	private String miniBar;
	private String coffren;
	private String douchBain;
	private String grandLit;
	private String communic;
	private String distance;
	private String balcon;
	private String vue;
	private String salon;
	private String soleil;
	private Long nbLits;
	private String codClasse1;
	private String codClasse2;
	private String communiquante;
	private String tel;
	private String codType;
	private String codAlie;
	@Column
	private Long ordre;
	

	
	@OneToMany(mappedBy = "typeChambre")
	private List<Chambre> chambres;


	
	@ManyToOne
	private Etat_Chambre etat_Chambre;



	public TypeChambre() {
		super();
		// TODO Auto-generated constructor stub
	}



	public TypeChambre(String commentaire, Long television, String telephone, String climant, String miniBar,
			String coffren, String douchBain, String grandLit, String communic, String distance, String balcon,
			String vue, String salon, String soleil, Long nbLits, String codClasse1, String codClasse2,
			String communiquante, String tel, String codType, String codAlie, Long ordre, List<Chambre> chambres,
			Etat_Chambre etat_Chambre) {
		super();
		this.commentaire = commentaire;
		this.television = television;
		this.telephone = telephone;
		this.climant = climant;
		this.miniBar = miniBar;
		this.coffren = coffren;
		this.douchBain = douchBain;
		this.grandLit = grandLit;
		this.communic = communic;
		this.distance = distance;
		this.balcon = balcon;
		this.vue = vue;
		this.salon = salon;
		this.soleil = soleil;
		this.nbLits = nbLits;
		this.codClasse1 = codClasse1;
		this.codClasse2 = codClasse2;
		this.communiquante = communiquante;
		this.tel = tel;
		this.codType = codType;
		this.codAlie = codAlie;
		this.ordre = ordre;
		this.chambres = chambres;
		this.etat_Chambre = etat_Chambre;
	}



	public String getCode_categ() {
		return code_categ;
	}



	public void setCode_categ(String code_categ) {
		this.code_categ = code_categ;
	}



	public String getCommentaire() {
		return commentaire;
	}



	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}



	public Long getTelevision() {
		return television;
	}



	public void setTelevision(Long television) {
		this.television = television;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public String getClimant() {
		return climant;
	}



	public void setClimant(String climant) {
		this.climant = climant;
	}



	public String getMiniBar() {
		return miniBar;
	}



	public void setMiniBar(String miniBar) {
		this.miniBar = miniBar;
	}



	public String getCoffren() {
		return coffren;
	}



	public void setCoffren(String coffren) {
		this.coffren = coffren;
	}



	public String getDouchBain() {
		return douchBain;
	}



	public void setDouchBain(String douchBain) {
		this.douchBain = douchBain;
	}



	public String getGrandLit() {
		return grandLit;
	}



	public void setGrandLit(String grandLit) {
		this.grandLit = grandLit;
	}



	public String getCommunic() {
		return communic;
	}



	public void setCommunic(String communic) {
		this.communic = communic;
	}



	public String getDistance() {
		return distance;
	}



	public void setDistance(String distance) {
		this.distance = distance;
	}



	public String getBalcon() {
		return balcon;
	}



	public void setBalcon(String balcon) {
		this.balcon = balcon;
	}



	public String getVue() {
		return vue;
	}



	public void setVue(String vue) {
		this.vue = vue;
	}



	public String getSalon() {
		return salon;
	}



	public void setSalon(String salon) {
		this.salon = salon;
	}



	public String getSoleil() {
		return soleil;
	}



	public void setSoleil(String soleil) {
		this.soleil = soleil;
	}



	public Long getNbLits() {
		return nbLits;
	}



	public void setNbLits(Long nbLits) {
		this.nbLits = nbLits;
	}



	public String getCodClasse1() {
		return codClasse1;
	}



	public void setCodClasse1(String codClasse1) {
		this.codClasse1 = codClasse1;
	}



	public String getCodClasse2() {
		return codClasse2;
	}



	public void setCodClasse2(String codClasse2) {
		this.codClasse2 = codClasse2;
	}



	public String getCommuniquante() {
		return communiquante;
	}



	public void setCommuniquante(String communiquante) {
		this.communiquante = communiquante;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getCodType() {
		return codType;
	}



	public void setCodType(String codType) {
		this.codType = codType;
	}



	public String getCodAlie() {
		return codAlie;
	}



	public void setCodAlie(String codAlie) {
		this.codAlie = codAlie;
	}



	public Long getOrdre() {
		return ordre;
	}



	public void setOrdre(Long ordre) {
		this.ordre = ordre;
	}



	public List<Chambre> getChambres() {
		return chambres;
	}



	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}



	public Etat_Chambre getEtat_Chambre() {
		return etat_Chambre;
	}



	public void setEtat_Chambre(Etat_Chambre etat_Chambre) {
		this.etat_Chambre = etat_Chambre;
	}
	


	
	
	
	
}
