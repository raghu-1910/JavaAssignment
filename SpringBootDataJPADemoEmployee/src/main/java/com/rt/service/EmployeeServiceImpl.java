package com.rt.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.dao.Employeedao;
import com.rt.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	Employeedao dao;
	@Override
	public Employee addEmployee(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		dao.deleteById(empId);
	}

	@Override
	public Optional<Employee> getEmployee(int empId) {
		 return dao.findById(empId);
	}

	@Override
	public Iterable<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
