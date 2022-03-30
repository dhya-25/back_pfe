package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Hotel;

public interface HotelDao extends JpaRepository<Hotel,Long>{

}
