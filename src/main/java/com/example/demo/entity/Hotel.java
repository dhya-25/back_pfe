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

@Entity
public class Hotel {
	
	@Id
	@GeneratedValue/*strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR"*/
	//@SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName = "SEQ_CONTRATAGENCE", allocationSize = 1)
	private Long idHotel;
	private String nom_hotel;
	private String adr1_hotel;
	private String adr2_hotel;
	private String adr3_hotel;
	private String tel_hotel;
	private String fax_hotel;
	private String mat_fiscale;
	private Long chambre_hotel;
	private Long lit_hotel;
	
	
	

	@Temporal(TemporalType.DATE)
	private Date deb_saison_hotel;

	@Temporal(TemporalType.DATE)
	private Date fin_saison_hotel;
	private String status_hotel;
	private String ccb1_hotel;
	private String ccb2_hotel;
	private String cpt_client_hotel;
	private String cpt_avance_hotel;
	private String jor_vente_hotel;
	private String jor_od_hotel;
	private String jor_caisse_hotel;
	private String jor_banque_hotel;
	private String lais_caisse_hotel;
	private String lais_stand_hotel;
	private String sigle_hotel;
	private String ref_hotel;
	private String input_hotel;
	private String cpt_trans_hotel;
	private String email;
	
	@ManyToOne
	private Reservation reservation;
	
	@OneToMany(mappedBy = "hotel")
	private List<RoomRack> roomrack;
	

	
	public Hotel(String nom_hotel, String adr1_hotel, String adr2_hotel, String adr3_hotel, String tel_hotel,
			String fax_hotel, String mat_fiscale, Long chambre_hotel, Long lit_hotel, Date deb_saison_hotel,
			Date fin_saison_hotel, String status_hotel, String ccb1_hotel, String ccb2_hotel, String cpt_client_hotel,
			String cpt_avance_hotel, String jor_vente_hotel, String jor_od_hotel, String jor_caisse_hotel,
			String jor_banque_hotel, String lais_caisse_hotel, String lais_stand_hotel, String sigle_hotel,
			String ref_hotel, String input_hotel, String cpt_trans_hotel, String email, Reservation reservation,
			List<RoomRack> roomrack) {
		super();
		this.nom_hotel = nom_hotel;
		this.adr1_hotel = adr1_hotel;
		this.adr2_hotel = adr2_hotel;
		this.adr3_hotel = adr3_hotel;
		this.tel_hotel = tel_hotel;
		this.fax_hotel = fax_hotel;
		this.mat_fiscale = mat_fiscale;
		this.chambre_hotel = chambre_hotel;
		this.lit_hotel = lit_hotel;
		this.deb_saison_hotel = deb_saison_hotel;
		this.fin_saison_hotel = fin_saison_hotel;
		this.status_hotel = status_hotel;
		this.ccb1_hotel = ccb1_hotel;
		this.ccb2_hotel = ccb2_hotel;
		this.cpt_client_hotel = cpt_client_hotel;
		this.cpt_avance_hotel = cpt_avance_hotel;
		this.jor_vente_hotel = jor_vente_hotel;
		this.jor_od_hotel = jor_od_hotel;
		this.jor_caisse_hotel = jor_caisse_hotel;
		this.jor_banque_hotel = jor_banque_hotel;
		this.lais_caisse_hotel = lais_caisse_hotel;
		this.lais_stand_hotel = lais_stand_hotel;
		this.sigle_hotel = sigle_hotel;
		this.ref_hotel = ref_hotel;
		this.input_hotel = input_hotel;
		this.cpt_trans_hotel = cpt_trans_hotel;
		this.email = email;
		this.reservation = reservation;
		this.roomrack = roomrack;
	}
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public List<RoomRack> getRoomrack() {
		return roomrack;
	}
	public void setRoomrack(List<RoomRack> roomrack) {
		this.roomrack = roomrack;
	}

	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	public String getNom_hotel() {
		return nom_hotel;
	}
	public void setNom_hotel(String nom_hotel) {
		this.nom_hotel = nom_hotel;
	}
	public String getAdr1_hotel() {
		return adr1_hotel;
	}
	public void setAdr1_hotel(String adr1_hotel) {
		this.adr1_hotel = adr1_hotel;
	}
	public String getAdr2_hotel() {
		return adr2_hotel;
	}
	public void setAdr2_hotel(String adr2_hotel) {
		this.adr2_hotel = adr2_hotel;
	}
	public String getAdr3_hotel() {
		return adr3_hotel;
	}
	public void setAdr3_hotel(String adr3_hotel) {
		this.adr3_hotel = adr3_hotel;
	}
	public String getTel_hotel() {
		return tel_hotel;
	}
	public void setTel_hotel(String tel_hotel) {
		this.tel_hotel = tel_hotel;
	}
	public String getFax_hotel() {
		return fax_hotel;
	}
	public void setFax_hotel(String fax_hotel) {
		this.fax_hotel = fax_hotel;
	}
	public String getMat_fiscale() {
		return mat_fiscale;
	}
	public void setMat_fiscale(String mat_fiscale) {
		this.mat_fiscale = mat_fiscale;
	}
	public Long getChambre_hotel() {
		return chambre_hotel;
	}
	public void setChambre_hotel(Long chambre_hotel) {
		this.chambre_hotel = chambre_hotel;
	}
	public Long getLit_hotel() {
		return lit_hotel;
	}
	public void setLit_hotel(Long lit_hotel) {
		this.lit_hotel = lit_hotel;
	}
	public Date getDeb_saison_hotel() {
		return deb_saison_hotel;
	}
	public void setDeb_saison_hotel(Date deb_saison_hotel) {
		this.deb_saison_hotel = deb_saison_hotel;
	}
	public Date getFin_saison_hotel() {
		return fin_saison_hotel;
	}
	public void setFin_saison_hotel(Date fin_saison_hotel) {
		this.fin_saison_hotel = fin_saison_hotel;
	}
	public String getStatus_hotel() {
		return status_hotel;
	}
	public void setStatus_hotel(String status_hotel) {
		this.status_hotel = status_hotel;
	}
	public String getCcb1_hotel() {
		return ccb1_hotel;
	}
	public void setCcb1_hotel(String ccb1_hotel) {
		this.ccb1_hotel = ccb1_hotel;
	}
	public String getCcb2_hotel() {
		return ccb2_hotel;
	}
	public void setCcb2_hotel(String ccb2_hotel) {
		this.ccb2_hotel = ccb2_hotel;
	}
	public String getCpt_client_hotel() {
		return cpt_client_hotel;
	}
	public void setCpt_client_hotel(String cpt_client_hotel) {
		this.cpt_client_hotel = cpt_client_hotel;
	}
	public String getCpt_avance_hotel() {
		return cpt_avance_hotel;
	}
	public void setCpt_avance_hotel(String cpt_avance_hotel) {
		this.cpt_avance_hotel = cpt_avance_hotel;
	}
	public String getJor_vente_hotel() {
		return jor_vente_hotel;
	}
	public void setJor_vente_hotel(String jor_vente_hotel) {
		this.jor_vente_hotel = jor_vente_hotel;
	}
	public String getJor_od_hotel() {
		return jor_od_hotel;
	}
	public void setJor_od_hotel(String jor_od_hotel) {
		this.jor_od_hotel = jor_od_hotel;
	}
	public String getJor_caisse_hotel() {
		return jor_caisse_hotel;
	}
	public void setJor_caisse_hotel(String jor_caisse_hotel) {
		this.jor_caisse_hotel = jor_caisse_hotel;
	}
	public String getJor_banque_hotel() {
		return jor_banque_hotel;
	}
	public void setJor_banque_hotel(String jor_banque_hotel) {
		this.jor_banque_hotel = jor_banque_hotel;
	}
	public String getLais_caisse_hotel() {
		return lais_caisse_hotel;
	}
	public void setLais_caisse_hotel(String lais_caisse_hotel) {
		this.lais_caisse_hotel = lais_caisse_hotel;
	}
	public String getLais_stand_hotel() {
		return lais_stand_hotel;
	}
	public void setLais_stand_hotel(String lais_stand_hotel) {
		this.lais_stand_hotel = lais_stand_hotel;
	}
	public String getSigle_hotel() {
		return sigle_hotel;
	}
	public void setSigle_hotel(String sigle_hotel) {
		this.sigle_hotel = sigle_hotel;
	}
	public String getRef_hotel() {
		return ref_hotel;
	}
	public void setRef_hotel(String ref_hotel) {
		this.ref_hotel = ref_hotel;
	}
	public String getInput_hotel() {
		return input_hotel;
	}
	public void setInput_hotel(String input_hotel) {
		this.input_hotel = input_hotel;
	}
	public String getCpt_trans_hotel() {
		return cpt_trans_hotel;
	}
	public void setCpt_trans_hotel(String cpt_trans_hotel) {
		this.cpt_trans_hotel = cpt_trans_hotel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}









	
	


	
}
