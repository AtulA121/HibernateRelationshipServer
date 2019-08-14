package com.hibernateRelationship.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Cars {
	@Id
	@GeneratedValue
	@Column(name="carId")
	int carId;
	
	@Column(name="carName")
	String carName;

	@OneToOne(mappedBy="car",cascade=CascadeType.ALL)
	private Owners owner;

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "Cars [carId=" + carId + ", carName=" + carName + "]";
	}
	
	
}
