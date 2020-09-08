package com.experiments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.experiments.entity.Employee;
import com.experiments.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployees(){
		ResponseEntity<List<Employee>> response = new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(), HttpStatus.OK);
		return response;
	}
}
