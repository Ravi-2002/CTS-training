package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@Column(name="eid")
	@GeneratedValue
	private int employeeId;
	private String employeeName;
	private int salery;
	private String resignation;
	public Employee(int employeeId, String employeeName, int salery, String resignation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salery = salery;
		this.resignation = resignation;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalery() {
		return salery;
	}
	public void setSalery(int salery) {
		this.salery = salery;
	}
	public String getResignation() {
		return resignation;
	}
	public void setResignation(String resignation) {
		this.resignation = resignation;
	}
	public Employee() {

	}
	

}
