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

import com.example.demo.dao.AgenceDao;
import com.example.demo.dao.ResidentDao;
import com.example.demo.entity.Agence;
import com.example.demo.entity.Resident;
import com.example.demo.exception.ProductNotFoundException;


@RestController
@CrossOrigin
@RequestMapping("/resident")
public class ResidentController {
	@Autowired
	private ResidentDao residentDao;

	@PostMapping("/add")

	public ResponseEntity<Resident> createResident(@RequestBody Resident resident) {
		return ResponseEntity.ok(residentDao.save(resident));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Resident>> getResidentList() {

		return ResponseEntity.ok(residentDao.findAll());
	}
	
	@CrossOrigin
	@GetMapping("/getByChambre/{chambre}")
	public ResponseEntity<List<Resident>> findByChambre(@PathVariable	String chambre) {

		return ResponseEntity.ok(residentDao.findByChambre(chambre));
	}
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Resident> findResident(@PathVariable Long id) {
		return ResponseEntity.ok(
				residentDao.findById(id).orElseThrow(() -> new ProductNotFoundException("agence Not found")));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteResident(@PathVariable Long id) {
		residentDao.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}

}
