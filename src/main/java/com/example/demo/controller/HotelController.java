package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ContratAgenceDao;
import com.example.demo.dao.HotelDao;
import com.example.demo.entity.ContratAgence;
import com.example.demo.entity.Hotel;
import com.example.demo.exception.ProductNotFoundException;

@RestController
@CrossOrigin
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelDao hotelDao;

	@PostMapping("/add")

	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel ) {
		return ResponseEntity.ok(hotelDao.save(hotel));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Hotel>> getHotelList() {

		return ResponseEntity.ok(hotelDao.findAll());
	}
	
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Hotel> findHotel(@PathVariable Long id) {
		return ResponseEntity.ok(
				hotelDao.findById(id).orElseThrow(() -> new ProductNotFoundException("Contrat agence Not found")));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteHotel(@PathVariable Long id) {
		hotelDao.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}

}
