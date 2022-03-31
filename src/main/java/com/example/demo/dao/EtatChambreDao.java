package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Etat_Chambre;

public interface EtatChambreDao extends JpaRepository<Etat_Chambre,String> {

}
