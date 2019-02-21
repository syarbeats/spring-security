package com.spring.security.services;

import java.util.List;

import com.spring.security.model.Employee;

public interface EmployeeServices {
	void save(Employee employee);
	List<Employee> list();
	Employee getEmployee(String name);
}
