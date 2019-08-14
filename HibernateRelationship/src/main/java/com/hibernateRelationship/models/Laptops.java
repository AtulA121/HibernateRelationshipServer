package com.hibernateRelationship.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="laptops")
public class Laptops {
	@Id
	@GeneratedValue
	@Column(name="laptopId")
	int laptopId;
	
	@Column(name="laptopName")
	String laptopName;
	
	@ManyToMany(mappedBy="laptop",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	List<Users> user;

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	@Override
	public String toString() {
		return "Laptops [laptopId=" + laptopId + ", laptopName=" + laptopName + "]";
	}
}
