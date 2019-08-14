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
@Table(name="specimen")
public class Specimen {
	@Id
	@GeneratedValue
	@Column(name="specimenId")
	private int specimenId;
	
	@Column(name="latitude")
	private String latitude;
	
	@Column(name="longitude")
	private String longitude;

//	@OneToMany(mappedBy="specimen",cascade=CascadeType.ALL,fetch=FetchType.LAZY)	//fetch child entities
	@OneToMany(mappedBy="specimen",cascade=CascadeType.ALL,fetch=FetchType.EAGER)	//fetch child entities along with parent
	List<Photos> photos;
	
	public int getSpecimenId() {
		return specimenId;
	}

	public void setSpecimenId(int specimenId) {
		this.specimenId = specimenId;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Specimen [specimenId=" + specimenId + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
}
