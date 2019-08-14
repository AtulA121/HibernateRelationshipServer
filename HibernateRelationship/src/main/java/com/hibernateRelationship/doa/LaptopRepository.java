package com.hibernateRelationship.doa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernateRelationship.models.Laptops;

@Repository
public interface LaptopRepository extends CrudRepository<Laptops,Integer> {
	List<Laptops> findLaptopByLaptopName(String laptopName);
}
