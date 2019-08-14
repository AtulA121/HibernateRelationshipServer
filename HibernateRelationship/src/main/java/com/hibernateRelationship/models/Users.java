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
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue
	@Column(name="userId")
	int userId;
	
	@Column(name="userName")
	String userName;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	List<Laptops> laptop;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Laptops> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptops> laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", laptop=" + laptop + "]";
	}
}
