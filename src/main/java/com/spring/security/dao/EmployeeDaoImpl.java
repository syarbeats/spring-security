package com.spring.security.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.security.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Employee employee) {
		
		this.getSessionFactory().getCurrentSession().save(employee);
	}

	@Override
	public List<Employee> list() {
		
		@SuppressWarnings("unchecked")
	    TypedQuery<Employee> query = getSessionFactory().getCurrentSession().createQuery("from Employee");
	    return query.getResultList();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
