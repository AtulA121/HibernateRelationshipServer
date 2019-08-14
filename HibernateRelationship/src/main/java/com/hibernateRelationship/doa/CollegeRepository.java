package com.hibernateRelationship.doa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernateRelationship.models.College;

@Repository
public interface CollegeRepository extends CrudRepository<College,Integer> {

}
