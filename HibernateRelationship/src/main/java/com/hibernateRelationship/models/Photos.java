package com.hibernateRelationship.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="photos")
public class Photos {
	@Id
	@GeneratedValue
	@Column(name="photoId")
	private int photoId;
	
	@Column(name="path")
	private String path;
	
	@Column(name="fileName")
	private String fileName;
	
	@ManyToOne
	@JoinColumn(name="specimenId")
	Specimen specimen;

	public int getPhotoId() {
		return photoId;
	}

	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Specimen getSpecimen() {
		return specimen;
	}

	public void setSpecimen(Specimen specimen) {
		this.specimen = specimen;
	}

	@Override
	public String toString() {
		return "Photos [photoId=" + photoId + ", path=" + path + ", fileName=" + fileName + ", specimen=" + specimen
				+ "]";
	}
}
