package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Utilisateur;

public interface UtilisateurDao extends MongoRepository<Utilisateur, Long>{

}
