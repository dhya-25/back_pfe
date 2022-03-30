package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Resident;

public interface ResidentDao extends JpaRepository<Resident,Long>{

}
