package com.hibernateRelationship.doa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernateRelationship.models.Departments;

@Repository
public interface DepartmentRepository extends CrudRepository<Departments,Integer> {
	
}
