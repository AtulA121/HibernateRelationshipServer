package com.hibernateRelationship.doa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernateRelationship.models.Photos;

@Repository
public interface PhotoRepository extends CrudRepository<Photos,Integer>{
	
}
