package com.cg.labbook1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.labbook1.bean.Employee;

@Component
public class DaoImp implements IDao {
	
	
	private Employee emp;
	
	

	public Employee getEmp() {
		return emp;
	}


	@Autowired
	public void setEmp(Employee emp) {
		this.emp = emp;
	}



	@Override
	public String display() {
		
		return emp.toString();	
	}

}
