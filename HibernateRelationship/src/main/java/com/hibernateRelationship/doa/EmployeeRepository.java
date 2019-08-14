package com.hibernateRelationship.doa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hibernateRelationship.models.Employees;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees,Integer>{

	//creating own queries
	@Query("from Employees where department_id=?1")
	List<Employees> findEmployeeByDepartmentId(int departmentObj);

	//use existing functionality of repository
	List<Employees> findEmployeeByEmployeeName(String employeeName);
	
}
