package com.ex.WhatsApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmpController1 {

	private final EmployeeService employeeService;

	@Autowired
	public EmpController1(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	// 1. Get all employees
	@GetMapping("/allEmp")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees = employeeService.getAllEMployee();
		return ResponseEntity.ok(employees);
	}

	// 2. Get employee by ID
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
		Employee employee = employeeService.getEmployeeById(id);
		if (employee != null) {
			return ResponseEntity.ok(employee);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
