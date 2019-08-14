package com.hibernateRelationship.doa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernateRelationship.models.Laptops;
import com.hibernateRelationship.models.Users;

@Repository
public interface UserRepository extends CrudRepository<Users,Integer> {
	List<Users> findUserByLaptop(Laptops laptops);
}
