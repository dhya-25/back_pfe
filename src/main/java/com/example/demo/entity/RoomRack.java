package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RoomRack {
	@Id
	@GeneratedValue/*strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR"*/
	//@SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName = "SEQ_CONTRATAGENCE", allocationSize = 1)
	private Long idRoomRack;
	 private Long num_chambre ; 
	 private String cod_natcod_etat ; 
	 @Temporal(TemporalType.DATE)
	 private Date date_livrdate_debut ;
	 @Temporal(TemporalType.DATE)
	 private Date date_fin ;
	  
	 @ManyToOne
		private Hotel hotel;
	 
	
	public RoomRack(Long num_chambre, String cod_natcod_etat, Date date_livrdate_debut, Date date_fin, Hotel hotel) {
		super();
		this.num_chambre = num_chambre;
		this.cod_natcod_etat = cod_natcod_etat;
		this.date_livrdate_debut = date_livrdate_debut;
		this.date_fin = date_fin;
		this.hotel = hotel;
	}
	public RoomRack() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getIdRoomRack() {
		return idRoomRack;
	}
	public void setIdRoomRack(Long idRoomRack) {
		this.idRoomRack = idRoomRack;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Long getNum_chambre() {
		return num_chambre;
	}
	public void setNum_chambre(Long num_chambre) {
		this.num_chambre = num_chambre;
	}
	public String getCod_natcod_etat() {
		return cod_natcod_etat;
	}
	public void setCod_natcod_etat(String cod_natcod_etat) {
		this.cod_natcod_etat = cod_natcod_etat;
	}
	public Date getDate_livrdate_debut() {
		return date_livrdate_debut;
	}
	public void setDate_livrdate_debut(Date date_livrdate_debut) {
		this.date_livrdate_debut = date_livrdate_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}


}
