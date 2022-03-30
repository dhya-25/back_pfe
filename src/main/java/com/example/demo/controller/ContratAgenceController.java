package com.example.demo.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AgenceDao;
import com.example.demo.dao.ContratAgenceDao;
import com.example.demo.entity.Agence;
import com.example.demo.entity.ContratAgence;
import com.example.demo.exception.ProductNotFoundException;

@RestController
@CrossOrigin
@RequestMapping("/contratAgence")
public class ContratAgenceController {
	
	@Autowired
	private ContratAgenceDao contratAgenceDao;

	@PostMapping("/add")

	public ResponseEntity<ContratAgence> createContrat(@RequestBody ContratAgence contratAgence) {
		return ResponseEntity.ok(contratAgenceDao.save(contratAgence));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<ContratAgence>> getContratAgenceList() {

		return ResponseEntity.ok(contratAgenceDao.findAll());
	}
	
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<ContratAgence> findContratAgence(@PathVariable Long id) {
		return ResponseEntity.ok(
				contratAgenceDao.findById(id).orElseThrow(() -> new ProductNotFoundException("Contrat agence Not found")));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteContratAgence(@PathVariable Long id) {
		contratAgenceDao.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}
	@CrossOrigin
	@PutMapping("/update")
	public ContratAgence update(@RequestBody ContratAgence contratAgence) throws NoSuchAlgorithmException {
		try {

			Optional<ContratAgence> contratagence = contratAgenceDao.findById(contratAgence.getIdContartAgence());
			contratagence.get().setCode_reduction(contratAgence.getCode_reduction());
			contratagence.get().setCode_supplement(contratAgence.getCode_supplement());
			contratagence.get().setCode_tarif(contratAgence.getCode_tarif());
			contratagence.get().setCpde_periode(contratAgence.getCpde_periode());
			contratagence.get().setDate_contrat(contratAgence.getDate_contrat());
			contratagence.get().setPrix_arragement(contratAgence.getPrix_arragement());
			contratagence.get().setPrix_reduction(contratAgence.getPrix_reduction());
			contratagence.get().setValeur_supp(contratAgence.getValeur_supp());
			
		
			ContratAgence ContraUpdated = contratAgenceDao.save(contratagence.get());
			return ContraUpdated;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
