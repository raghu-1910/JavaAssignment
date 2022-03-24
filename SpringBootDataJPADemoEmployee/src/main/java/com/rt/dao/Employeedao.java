package com.rt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rt.entity.Employee;

public interface Employeedao extends CrudRepository<Employee, Integer>  {
	
	

}
