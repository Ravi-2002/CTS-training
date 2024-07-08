package com.example.demo.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		entityManager.persist(employee);
		return "Employee saved successfully";
	}

	@Override
	public String updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		entityManager.merge(employee);
		return "employee updated successfully";
	}

	@Override
	public String deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		entityManager.remove(getEmployeeById(employeeId));
		return "deleted successfully";
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return entityManager.find(Employee.class, employeeId);
		
	}

	@Override
	public List<Employee> getAllemployees() {
		// TODO Auto-generated method stub
		TypedQuery<Employee> Employees = entityManager.createQuery("select a from Employee a",Employee.class);
		return Employees.getResultList();
	}

	@Override
	public List<Employee> getEmployeeBetweenPrices(int initialprice,int finalprice) {
		// TODO Auto-generated method stub
		
		TypedQuery<Employee> Employees1 = entityManager.createQuery("select a from Employee a where a.Salery between ?1 and ?2",Employee.class);
		Employees1.setParameter(1,initialprice);
		Employees1.setParameter(2,finalprice);
		return Employees1.getResultList();
	}

	@Override
	public List<Employee> getAllResignation(String resignation) {
		// TODO Auto-generated method stub
		TypedQuery<Employee> Employees1 = entityManager.createQuery("select a from Employee a where a.resignation=?1",Employee.class);
		Employees1.setParameter(1,resignation);
		return Employees1.getResultList();
	}

}
