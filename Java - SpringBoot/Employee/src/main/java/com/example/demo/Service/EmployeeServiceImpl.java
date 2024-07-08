package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.EmployeeDaoImpl;
import com.example.demo.Entity.Employee;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDaoImpl employeeDaoImpl;
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.addEmployee(employee);
	}

	@Override
	public String updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.updateEmployee(employee);
	}

	@Override
	public String deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.deleteEmployee(employeeId);
	}

	@Override
	public Employee getEmployeeById(int EmployeeId) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.getEmployeeById(EmployeeId);
	}

	@Override
	public List<Employee> getAllemployees() {
		// TODO Auto-generated method stub
		return employeeDaoImpl.getAllemployees();
	}

	@Override
	public List<Employee> getEmployeeBetweenPrices(int initialprice, int finalprice) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.getEmployeeBetweenPrices(initialprice, finalprice);
	}

	@Override
	public List<Employee> getAllResignation(String resignation) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.getAllResignation(resignation);
	}

	
}
