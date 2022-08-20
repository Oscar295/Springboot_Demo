package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Integer id;

	@Column(name = "name")
	private String name;

	@OneToOne(cascade = CascadeType.PERSIST)
	@PrimaryKeyJoinColumn
	private EmployeeDetail employeeDetail;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Department department;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Persmission> permissions;
	
	public EmployeeDetail getEmployeeDetail() {
		return employeeDetail;
	}

	public void setEmployeeDetail(EmployeeDetail employeeDetail) {
		this.employeeDetail = employeeDetail;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Persmission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Persmission> permissions) {
		this.permissions = permissions;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
