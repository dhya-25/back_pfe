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

import com.example.demo.dao.ChambreDao;
import com.example.demo.dao.ConsomationDao;
import com.example.demo.entity.Chambre;
import com.example.demo.entity.Consomation;
import com.example.demo.exception.ProductNotFoundException;


@RestController
@CrossOrigin
@RequestMapping("/consommation")
public class ConsomationController {
	
	@Autowired
	private ConsomationDao consomationDao;

	@PostMapping("/add")

	public ResponseEntity<Consomation> createConsomation(@RequestBody Consomation consomation ) {
		return ResponseEntity.ok(consomationDao.save(consomation));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Consomation>> getConsomationList() {

		return ResponseEntity.ok(consomationDao.findAll());
	}
	
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Consomation> findConsomation(@PathVariable Long id) {
		return ResponseEntity.ok(
				consomationDao.findById(id).orElseThrow(() -> new ProductNotFoundException("Contrat agence Not found")));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteConsomation(@PathVariable Long id) {
		consomationDao.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}

}
