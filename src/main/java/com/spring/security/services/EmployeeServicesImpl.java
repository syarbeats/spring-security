package com.spring.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.security.dao.EmployeeDao;
import com.spring.security.model.Employee;


@Service
public class EmployeeServicesImpl implements EmployeeServices{

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	@Transactional
	public void save(Employee employee) {
		employeeDao.save(employee);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Employee> list() {
		return employeeDao.list();
	}

	@Override
	public Employee getEmployee(String name) {
		
		return employeeDao.getEmployee(name);
	}

}
