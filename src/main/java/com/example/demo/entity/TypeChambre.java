package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class TypeChambre {
	
	
	@Id
	@GeneratedValue/*strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR"*/
	//@SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName = "SEQ_CONTRATAGENCE", allocationSize = 1)
	private String code_categ;
	
	private String commentaire;
	private Long television;
	private String telephone;
	private String climant;
	private String mini_bar;
	private String coffren;
	private String douch_bain;
	private String grand_lit;
	private String communic;
	private String distance;
	private String balcon;
	private String vue;
	private String salon;
	private String soleil;
	private Long nb_lits;
	private String cod_classe1;
	private String cod_classe2;
	private String communiquante;
	private String tel;
	private String cod_type;
	private String cod_alie;
	@Column
	private Long ordre;
	

	
	@OneToMany(mappedBy = "typeChambre")
	private List<Chambre> chambres;


	
	@ManyToOne
	private Etat_Chambre etat_Chambre;
	


	public TypeChambre(String commentaire, Long television, String telephone, String climant, String mini_bar,
			String coffren, String douch_bain, String grand_lit, String communic, String distance, String balcon,
			String vue, String salon, String soleil, Long nb_lits, String cod_classe1, String cod_classe2,
			String communiquante, String tel, String cod_type, String cod_alie, Long ordre, List<Chambre> chambre,
			Etat_Chambre etat_Chambre) {
		super();
		this.commentaire = commentaire;
		this.television = television;
		this.telephone = telephone;
		this.climant = climant;
		this.mini_bar = mini_bar;
		this.coffren = coffren;
		this.douch_bain = douch_bain;
		this.grand_lit = grand_lit;
		this.communic = communic;
		this.distance = distance;
		this.balcon = balcon;
		this.vue = vue;
		this.salon = salon;
		this.soleil = soleil;
		this.nb_lits = nb_lits;
		this.cod_classe1 = cod_classe1;
		this.cod_classe2 = cod_classe2;
		this.communiquante = communiquante;
		this.tel = tel;
		this.cod_type = cod_type;
		this.cod_alie = cod_alie;
		this.ordre = ordre;
	//	this.chambre = chambre;
		//this.etat_Chambre = etat_Chambre;
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

	public String getMini_bar() {
		return mini_bar;
	}

	public void setMini_bar(String mini_bar) {
		this.mini_bar = mini_bar;
	}

	public String getCoffren() {
		return coffren;
	}

	public void setCoffren(String coffren) {
		this.coffren = coffren;
	}

	public String getDouch_bain() {
		return douch_bain;
	}

	public void setDouch_bain(String douch_bain) {
		this.douch_bain = douch_bain;
	}

	public String getGrand_lit() {
		return grand_lit;
	}

	public void setGrand_lit(String grand_lit) {
		this.grand_lit = grand_lit;
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

	public Long getNb_lits() {
		return nb_lits;
	}

	public void setNb_lits(Long nb_lits) {
		this.nb_lits = nb_lits;
	}

	public String getCod_classe1() {
		return cod_classe1;
	}

	public void setCod_classe1(String cod_classe1) {
		this.cod_classe1 = cod_classe1;
	}

	public String getCod_classe2() {
		return cod_classe2;
	}

	public void setCod_classe2(String cod_classe2) {
		this.cod_classe2 = cod_classe2;
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

	public String getCod_type() {
		return cod_type;
	}

	public void setCod_type(String cod_type) {
		this.cod_type = cod_type;
	}

	public String getCod_alie() {
		return cod_alie;
	}

	public void setCod_alie(String cod_alie) {
		this.cod_alie = cod_alie;
	}

	public Long getOrdre() {
		return ordre;
	}

	public void setOrdre(Long ordre) {
		this.ordre = ordre;
	}

	
	
	
	
}
