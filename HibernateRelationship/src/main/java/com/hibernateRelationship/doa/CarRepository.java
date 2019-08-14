package com.hibernateRelationship.doa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernateRelationship.models.Cars;

@Repository
public interface CarRepository extends CrudRepository<Cars,Integer> {
	
}
