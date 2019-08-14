package com.hibernateRelationship.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernateRelationship.doa.SpecimenRepository;
import com.hibernateRelationship.models.Specimen;

@RestController
public class IndexController {
	@Autowired
	SpecimenRepository specimenRepository;
	
	@Autowired
	List<Specimen> specimenList;
	
	@CrossOrigin(origins="*")
	@GetMapping("/getAllNewSpecimenDataFromIndexController")
	public List<Specimen> getAllNewSpecimenDataFromIndexController()
	{
		System.out.println("/getAllNewSpecimenDataFromIndexController request...");
		specimenList=(List<Specimen>)specimenRepository.findAll();
		System.out.println(specimenList);
		return specimenList;
	}
}
