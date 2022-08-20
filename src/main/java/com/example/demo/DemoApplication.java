package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Department;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Persmission;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String...args) throws Exception{
//		System.out.println("---------------------------CommandLineRunner------------------------------------");
//		Department dept = new Department();
//		dept.setName("IT");
//		Persmission adminPermission = new Persmission();
//		adminPermission.setName("ADMIN");
//		Persmission managerPermission = new Persmission();
//		managerPermission.setName("MANAGER");
//		
//		List<Persmission> permissions = new ArrayList<Persmission>();
//		permissions.add(managerPermission);
//		permissions.add(adminPermission);
//		
//		Employee employee = new Employee();
//		employee.setName("Quan");
//		employee.setDepartment(dept);
//		employee.setPermissions(permissions);
//		employeeRepository.save(employee);
//		
//		Optional<Employee> employeeOptional = employeeRepository.findById(4);
//		Employee employee = employeeOptional.get();
//		System.out.println("Employee: " + employee.getName());
//		employee.setName("AN");
//		employeeRepository.save(employee);
//		
//		employeeRepository.deleteById(4);
		
		
	}
	
}
