package com.rt.service;

import java.util.List;
import java.util.Optional;

import com.rt.entity.Employee;


public interface EmployeeService {
	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(int empId);

	Optional<Employee> getEmployee(int empId);

	Iterable<Employee> getAllEmployees();

}
