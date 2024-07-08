package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@PostMapping("/add")
	public String addemployee(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
		return employeeServiceImpl.addEmployee(employee);
	}

	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
		return employeeServiceImpl.updateEmployee(employee);
	}

	@DeleteMapping("/delete/{employeeId}")
	public String deleteEmployee(@PathVariable("employeeId") int employeeId) {
		// TODO Auto-generated method stub
		return employeeServiceImpl.deleteEmployee(employeeId);
	}

	@GetMapping("/get/{EmployeeId}")
	public Employee getEmployeeById(@PathVariable("EmployeeId") int EmployeeId) {
		// TODO Auto-generated method stub
		return employeeServiceImpl.getEmployeeById(EmployeeId);
	}

	@GetMapping("/employee")
	public List<Employee> getAllemployees() {
		// TODO Auto-generated method stub
		return employeeServiceImpl.getAllemployees();
	}

	@GetMapping("/employeeprices/{initialprice}/{finalprice}")
	public List<Employee> getemployeeBetweenPrices(@PathVariable("initialprice")int initialprice,@PathVariable("finalrpice") int finalprice) {
		// TODO Auto-generated method stub
		return employeeServiceImpl.getEmployeeBetweenPrices(initialprice, finalprice);
	}

	@GetMapping("/findresignation/{resignation}")
	public List<Employee> getAllResignation(@PathVariable("resignation") String resignation) {
		// TODO Auto-generated method stub
		return employeeServiceImpl.getAllResignation(resignation);
	}
}
