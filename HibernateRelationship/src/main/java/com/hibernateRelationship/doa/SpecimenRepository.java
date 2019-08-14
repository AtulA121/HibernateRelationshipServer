package com.hibernateRelationship.doa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernateRelationship.models.Specimen;

@Repository
public interface SpecimenRepository extends CrudRepository<Specimen,Integer> {
	
}
