package com.hibernateRelationship.doa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernateRelationship.models.Students;

@Repository
public interface StudentRepository extends CrudRepository<Students,Integer>{
	
}
