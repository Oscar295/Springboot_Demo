package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeeDetail")
public class EmployeeDetail {
	@Id
	@Column(name = "id")
	private int id;
}
