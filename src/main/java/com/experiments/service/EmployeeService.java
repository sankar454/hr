package com.experiments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.experiments.entity.Employee;
import com.experiments.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
}
