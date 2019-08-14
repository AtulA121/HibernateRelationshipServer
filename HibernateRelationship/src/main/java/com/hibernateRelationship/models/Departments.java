package com.hibernateRelationship.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="departments")
public class Departments {
	@Id
	@GeneratedValue
	@Column(name="departmentId")
	private int departmentId;
	
	@Column(name="departmentName")
	private String departmentName;

//	@OneToMany(mappedBy="specimen",cascade=CascadeType.ALL,fetch=FetchType.LAZY)	//fetch child entities
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL,fetch=FetchType.EAGER)	//fetch child entities along with parent
	List<Employees> employee;
	
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Departments [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
}
