package com.cg.labbook1.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	@Value("${employeeId}")
	private int employeeId;
	@Value("${employeeName}")
	private String employeeName;
	@Value("${salary}")
	private int salary;
	@Value("${businessUnit}")
	private String businessUnit;
	@Value("${age}")
	private int age;
	public int getEmployeeId() {
		return employeeId;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(int employeeId, String employeeName, int salary, String businessUnit, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
