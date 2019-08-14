package com.hibernateRelationship.doa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernateRelationship.models.Owners;

@Repository
public interface OwnerRepository extends CrudRepository<Owners,Integer>{
	
}
