package com.cg.labbook1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.labbook1.bean.Employee;
import com.cg.labbook1.dao.DaoImp;

@Component
public class ServiceImp implements IService {

	private DaoImp dao;
	
	
	public DaoImp getDao() {
		return dao;
	}

	@Autowired
	public void setDao(DaoImp dao) {
		this.dao = dao;
	}


	@Override
	public void display() {
		
		Employee emp=dao.display();
		System.out.println("Employee Details");
		System.out.println("-----------------------------------------------------");
		System.out.println("Employee Id: "+emp.getEmployeeId());
		System.out.println("Employee Name: "+emp.getEmployeeName());
		System.out.println("Employee Age: "+emp.getAge());
		System.out.println("Employee Salary: "+emp.getSalary());
		System.out.println("Employee Business-Unit: "+emp.getBusinessUnit());
	}

}
