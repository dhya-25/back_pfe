package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Resident;

public interface ResidentDao extends JpaRepository<Resident,Long>{

	//Method to return a customer "Client" by the existence of parameter {nom} in the Nom (CltNom)
	 List<Resident> findByChambre(String chambre);
	
	//Method to return a customer "Client" by the existence of parameter {prenom} in the Prenom (CltPrenom)
	// List<Resident> findByIdReservation(Long idReservaion);
	

	
	
}
