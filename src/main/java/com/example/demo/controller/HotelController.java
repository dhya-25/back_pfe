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
import com.example.demo.model.hotelModel;
import com.example.demo.services.hotelService;

@RestController
@CrossOrigin
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelDao hotelDao;
	
	@Autowired
	private hotelService hotelService;


	@PostMapping("/add")
	public String createHotelUtilisateur(@RequestBody hotelModel studentModel){
        return hotelService.createResource(studentModel);
    }
	

	@CrossOrigin
	@GetMapping("/get")
	public List<hotelModel> readResources(){
        return hotelService.readResources();
    }
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<List<hotelModel>> findHotell() {
		return ResponseEntity.ok(
				hotelService.readResourcesById());
	}
	
	/*@CrossOrigin
	@GetMapping("/getbyidd/{id}")
	public List<hotelModel> readResourcesById(@PathVariable Long id){
        return hotelService.readResourcesById(id);
    }*/
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteHotel(@PathVariable Long id) {
		hotelDao.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}

}
