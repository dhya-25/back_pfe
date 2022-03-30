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

import com.example.demo.dao.FactureDao;
import com.example.demo.dao.ReservationDao;
import com.example.demo.entity.Facture;
import com.example.demo.entity.Reservation;
import com.example.demo.exception.ProductNotFoundException;

@RestController
@CrossOrigin
@RequestMapping("/facture")
public class FactureController {

	@Autowired
	private FactureDao factureDao;

	@PostMapping("/add")

	public ResponseEntity<Facture> createFacture(@RequestBody Facture facture ) {
		return ResponseEntity.ok(factureDao.save(facture));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Facture>> getFactureList() {

		return ResponseEntity.ok(factureDao.findAll());
	}
	
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Facture> findFacture(@PathVariable Long id) {
		return ResponseEntity.ok(
				factureDao.findById(id).orElseThrow(() -> new ProductNotFoundException("Contrat agence Not found")));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAgence(@PathVariable Long id) {
		factureDao.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}

	
}
