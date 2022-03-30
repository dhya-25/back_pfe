package com.example.demo.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AgenceDao;
import com.example.demo.entity.Agence;
import com.example.demo.exception.ProductNotFoundException;


@RestController
@CrossOrigin
@RequestMapping("/agence")
public class AgenceController {

	@Autowired
	private AgenceDao agenceDao;

	@PostMapping("/add")

	public ResponseEntity<Agence> createAgence(@RequestBody Agence agence) {
		return ResponseEntity.ok(agenceDao.save(agence));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Agence>> getAgenceList() {

		return ResponseEntity.ok(agenceDao.findAll());
	}
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Agence> findAgence(@PathVariable Long id) {
		return ResponseEntity.ok(
				agenceDao.findById(id).orElseThrow(() -> new ProductNotFoundException("agence Not found")));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAgence(@PathVariable Long id) {
		agenceDao.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}
	

	
	
	@CrossOrigin
	@PutMapping("/update")
	public Agence update(@RequestBody Agence agence) throws NoSuchAlgorithmException {
		try {

			Optional<Agence> Agence = agenceDao.findById(agence.getIdAgence());
			Agence.get().setAdr_One_Agence(agence.getAdr_One_Agence());
			Agence.get().setAdr_Two_Agence(agence.getAdr_Two_Agence());
			Agence.get().setAdr_Tree_Agence(agence.getAdr_Tree_Agence());
			Agence.get().setCpte_Agence(agence.getCpte_Agence());
			Agence.get().setEtat_Agence(agence.getEtat_Agence());
			Agence.get().setDomi_Agence(agence.getDomi_Agence());
			Agence.get().setEmail(agence.getEmail());
			Agence.get().setFax_Agence(agence.getFax_Agence());
			Agence.get().setNom_Agence(agence.getNom_Agence());
			Agence.get().setNom_Comercial(agence.getNom_Comercial());
			Agence.get().setPays_Agence(agence.getPays_Agence());
			Agence.get().setProvince_Agence(agence.getProvince_Agence());
			Agence.get().setRepresentant(agence.getRepresentant());
		
			Agence AdminUpdated = agenceDao.save(Agence.get());
			return AdminUpdated;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> handleProductNotFoundException() {
		return ResponseEntity.ok("Product Not Found");
	}

}
