package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Role;



@Repository
public class roleDao {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	public List<Role> findAll(){
		
		return mongoTemplate.findAll(Role.class);
	}
	
	public Role saveAll(final Role role) {
		return mongoTemplate.insert(role);
		
	}
	

}
