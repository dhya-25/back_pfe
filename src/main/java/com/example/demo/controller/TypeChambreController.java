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

import com.example.demo.dao.ResidentDao;
import com.example.demo.dao.TypeChambreDao;
import com.example.demo.entity.Resident;
import com.example.demo.entity.TypeChambre;
import com.example.demo.exception.ProductNotFoundException;

@RestController
@CrossOrigin
@RequestMapping("/reservation")
public class TypeChambreController {
	@Autowired
	private TypeChambreDao typeChambreDao;

	@PostMapping("/add")

	public ResponseEntity<TypeChambre> createTypeChambre(@RequestBody TypeChambre resident) {
		return ResponseEntity.ok(typeChambreDao.save(resident));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<TypeChambre>> getTypeChambreList() {

		return ResponseEntity.ok(typeChambreDao.findAll());
	}
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<TypeChambre> findTypeChambre(@PathVariable String id) {
		return ResponseEntity.ok(
				typeChambreDao.findById(id).orElseThrow(() -> new ProductNotFoundException("agence Not found")));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletetypeChambre(@PathVariable String id) {
		typeChambreDao.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}

}
