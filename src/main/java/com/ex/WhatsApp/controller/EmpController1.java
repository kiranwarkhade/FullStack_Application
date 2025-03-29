package com.ex.WhatsApp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.ex.WhatsApp.Employee;

public class EmpController1 {


@RestController
@RequestMapping("/employees")
public class EmpController {

	 private final employeeService EmployeeService;

	public EmpController(employeeService EmployeeService) // EmployeeService EmployeeService
	{
		 this.EmployeeService=EmployeeService;

	}

// EndPoints 1> all employee 2> get by Id

	@GetMapping("/allEmp")
	public ResponseEntity<List<Employee>> getAllEmployee() {

		List<Employee> employees=employeeService.getAllEMployee();
		
		return ResponseEntity.ok(employees);
	}
	
	// 
	@GetMapping("{id}")
	public ResponseEntity<Employee> getAEmployeeById(@PathVariable int id) {
	
		Employee employee=employeeService.getEmployeeById(id);
		
		if(employee != null) {
		return ResponseEntity.ok(employee);
		}
		else {
			return ResponseEntity.notFound().build();
		}
		
		
	}
	}
}
