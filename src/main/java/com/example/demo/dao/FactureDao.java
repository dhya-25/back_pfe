package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Facture;

public interface FactureDao extends JpaRepository<Facture,Long> {

}
