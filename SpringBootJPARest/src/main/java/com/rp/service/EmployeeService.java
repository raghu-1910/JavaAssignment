package com.rp.service;

import java.util.List;

import com.rp.entity.Employee;


public interface EmployeeService {
	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	String deleteEmployee(int empId);

	Employee getEmployee(int empId);

	List<Employee> getAllEmployees();

}
