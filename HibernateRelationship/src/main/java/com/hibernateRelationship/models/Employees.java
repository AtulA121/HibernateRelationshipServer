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
@Table(name="employees")
public class Employees {
	@Id
	@GeneratedValue
	@Column(name="EmployeeId")
	private int EmployeeId;
	
	@Column(name="employeeName")
	private String employeeName;
	
	@ManyToOne
	@JoinColumn(name="departmentId")
	Departments department;

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Departments getDepartment() {
		return department;
	}

	public void setDepartment(Departments department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employees [EmployeeId=" + EmployeeId + ", employeeName=" + employeeName + ", department=" + department
				+ "]";
	}
}
