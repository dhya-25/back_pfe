package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class Chambre {

	
	@Id
	@GeneratedValue/*strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR"*/
	//@SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName = "SEQ_CHAMBRE", allocationSize = 1)
	
	private Long idChambre;
	private Long codeResaChambre;
	private Long codReas;
	private Long nbrAdulte;
	private String nomResa;
	private String arrangAdult;
	private String arrangBebe;
	private Long nbrbebe;
	@Temporal(TemporalType.DATE)
	private Date dateArr;
	@Temporal(TemporalType.DATE)
	private Date dateDep;
	private String num_chambre ;
	private String code_vip ;
	private String etat_res ;
	private Long nbr_adult_a;
	private Long nbr_enfant_a;
	private Long nbr_bebe_a;
	private String commentaire ;
	private String heure_arr ;
	private String heure_dep ;
	private Long remise ; 
	private String motif ; 
	private Long prix_unitaire ; 
	private Long num_facture ; 
	@Temporal(TemporalType.DATE)
	private Date date_facture ; 
	private String offre ;
	private Long mnt_remise ;
	private String type_remise ;
	private String lib_remise ;
	@Temporal(TemporalType.DATE)
	private Date date_remise ; 
	private Long user_remise ;
	private String type_prix ;
	
	private long tot_adult;
	private long tot_enfant ;
	
	
	@OneToMany(mappedBy = "chambre")
	private List<Resident> residents;


	
	@ManyToOne
	private Reservation reservation;
	
	@ManyToOne
	private Facture facture;
	
	@ManyToOne
	private TypeChambre typeChambre;
	
	public long getIdChambre() {
		return idChambre;
	}
	public void setIdChambre(long idChambre) {
		this.idChambre = idChambre;
	}
	public long getCodeResaChambre() {
		return codeResaChambre;
	}
	public void setCodeResaChambre(long codeResaChambre) {
		this.codeResaChambre = codeResaChambre;
	}
	public long getCodReas() {
		return codReas;
	}
	public void setCodReas(long codReas) {
		this.codReas = codReas;
	}
	public long getNbrAdulte() {
		return nbrAdulte;
	}
	public void setNbrAdulte(long nbrAdulte) {
		this.nbrAdulte = nbrAdulte;
	}
	public String getNomResa() {
		return nomResa;
	}
	public void setNomResa(String nomResa) {
		this.nomResa = nomResa;
	}
	public String getArrangAdult() {
		return arrangAdult;
	}
	public void setArrangAdult(String arrangAdult) {
		this.arrangAdult = arrangAdult;
	}
	public String getArrangBebe() {
		return arrangBebe;
	}
	public void setArrangBebe(String arrangBebe) {
		this.arrangBebe = arrangBebe;
	}
	public long getNbrbebe() {
		return nbrbebe;
	}
	public void setNbrbebe(long nbrbebe) {
		this.nbrbebe = nbrbebe;
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
	public String getNum_chambre() {
		return num_chambre;
	}
	public void setNum_chambre(String num_chambre) {
		this.num_chambre = num_chambre;
	}
	public String getCode_vip() {
		return code_vip;
	}
	public void setCode_vip(String code_vip) {
		this.code_vip = code_vip;
	}
	public String getEtat_res() {
		return etat_res;
	}
	public void setEtat_res(String etat_res) {
		this.etat_res = etat_res;
	}
	public Long getNbr_adult_a() {
		return nbr_adult_a;
	}
	public void setNbr_adult_a(Long nbr_adult_a) {
		this.nbr_adult_a = nbr_adult_a;
	}
	public Long getNbr_enfant_a() {
		return nbr_enfant_a;
	}
	public void setNbr_enfant_a(Long nbr_enfant_a) {
		this.nbr_enfant_a = nbr_enfant_a;
	}
	public Long getNbr_bebe_a() {
		return nbr_bebe_a;
	}
	public void setNbr_bebe_a(Long nbr_bebe_a) {
		this.nbr_bebe_a = nbr_bebe_a;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getHeure_arr() {
		return heure_arr;
	}
	public void setHeure_arr(String heure_arr) {
		this.heure_arr = heure_arr;
	}
	public String getHeure_dep() {
		return heure_dep;
	}
	public void setHeure_dep(String heure_dep) {
		this.heure_dep = heure_dep;
	}
	public Long getRemise() {
		return remise;
	}
	public void setRemise(Long remise) {
		this.remise = remise;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public Long getPrix_unitaire() {
		return prix_unitaire;
	}
	public void setPrix_unitaire(Long prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}
	public Long getNum_facture() {
		return num_facture;
	}
	public void setNum_facture(Long num_facture) {
		this.num_facture = num_facture;
	}
	public Date getDate_facture() {
		return date_facture;
	}
	public void setDate_facture(Date date_facture) {
		this.date_facture = date_facture;
	}
	public String getOffre() {
		return offre;
	}
	public void setOffre(String offre) {
		this.offre = offre;
	}
	public long getMnt_remise() {
		return mnt_remise;
	}
	public void setMnt_remise(long mnt_remise) {
		this.mnt_remise = mnt_remise;
	}
	public String getType_remise() {
		return type_remise;
	}
	public void setType_remise(String type_remise) {
		this.type_remise = type_remise;
	}
	public String getLib_remise() {
		return lib_remise;
	}
	public void setLib_remise(String lib_remise) {
		this.lib_remise = lib_remise;
	}
	public Date getDate_remise() {
		return date_remise;
	}
	public void setDate_remise(Date date_remise) {
		this.date_remise = date_remise;
	}
	public long getUser_remise() {
		return user_remise;
	}
	public void setUser_remise(long user_remise) {
		this.user_remise = user_remise;
	}
	public String getType_prix() {
		return type_prix;
	}
	public void setType_prix(String type_prix) {
		this.type_prix = type_prix;
	}
	public long getTot_adult() {
		return tot_adult;
	}
	public void setTot_adult(long tot_adult) {
		this.tot_adult = tot_adult;
	}
	public long getTot_enfant() {
		return tot_enfant;
	}
	public void setTot_enfant(long tot_enfant) {
		this.tot_enfant = tot_enfant;
	}

	public List<Resident> getResidents() {
		return residents;
	}
	public void setResidents(List<Resident> residents) {
		this.residents = residents;
	}
	
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public void setIdChambre(Long idChambre) {
		this.idChambre = idChambre;
	}
	public void setCodeResaChambre(Long codeResaChambre) {
		this.codeResaChambre = codeResaChambre;
	}
	public void setCodReas(Long codReas) {
		this.codReas = codReas;
	}
	public void setNbrAdulte(Long nbrAdulte) {
		this.nbrAdulte = nbrAdulte;
	}
	public void setNbrbebe(Long nbrbebe) {
		this.nbrbebe = nbrbebe;
	}
	public void setMnt_remise(Long mnt_remise) {
		this.mnt_remise = mnt_remise;
	}
	public void setUser_remise(Long user_remise) {
		this.user_remise = user_remise;
	}
	public Chambre(Long codeResaChambre, Long codReas, Long nbrAdulte, String nomResa, String arrangAdult,
			String arrangBebe, Long nbrbebe, Date dateArr, Date dateDep, String num_chambre, String code_vip,
			String etat_res, Long nbr_adult_a, Long nbr_enfant_a, Long nbr_bebe_a, String commentaire, String heure_arr,
			String heure_dep, Long remise, String motif, Long prix_unitaire, Long num_facture, Date date_facture,
			String offre, Long mnt_remise, String type_remise, String lib_remise, Date date_remise, Long user_remise,
			String type_prix, long tot_adult, long tot_enfant, List<Resident> residents, TypeChambre typechambre,
			Reservation reservation, Facture facture) {
		super();
		this.codeResaChambre = codeResaChambre;
		this.codReas = codReas;
		this.nbrAdulte = nbrAdulte;
		this.nomResa = nomResa;
		this.arrangAdult = arrangAdult;
		this.arrangBebe = arrangBebe;
		this.nbrbebe = nbrbebe;
		this.dateArr = dateArr;
		this.dateDep = dateDep;
		this.num_chambre = num_chambre;
		this.code_vip = code_vip;
		this.etat_res = etat_res;
		this.nbr_adult_a = nbr_adult_a;
		this.nbr_enfant_a = nbr_enfant_a;
		this.nbr_bebe_a = nbr_bebe_a;
		this.commentaire = commentaire;
		this.heure_arr = heure_arr;
		this.heure_dep = heure_dep;
		this.remise = remise;
		this.motif = motif;
		this.prix_unitaire = prix_unitaire;
		this.num_facture = num_facture;
		this.date_facture = date_facture;
		this.offre = offre;
		this.mnt_remise = mnt_remise;
		this.type_remise = type_remise;
		this.lib_remise = lib_remise;
		this.date_remise = date_remise;
		this.user_remise = user_remise;
		this.type_prix = type_prix;
		this.tot_adult = tot_adult;
		this.tot_enfant = tot_enfant;
		this.residents = residents;
		//this.typechambre = typechambre;
		this.reservation = reservation;
		this.facture = facture;
	}
	public Chambre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
