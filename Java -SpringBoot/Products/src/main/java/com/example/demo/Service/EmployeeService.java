package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;

public interface EmployeeService {

	
abstract String addEmployee(Employee employee);

abstract String updateEmployee(Employee employee);
abstract String deleteEmployee(int employeeId);
abstract Employee getEmployeeById(int employeeId);
abstract List<Employee> getAllemployees();
abstract List<Employee> getEmployeeBetweenPrices(int initialprice,int finalprice);
abstract List<Employee> getAllResignation(String resignation);
}
