package com.spring.security.dao;

import java.util.List;

import com.spring.security.model.Employee;

public interface EmployeeDao {
	 void save(Employee employee);
	   List<Employee> list();
}
