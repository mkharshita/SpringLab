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
		
		System.out.println(dao.display());
	}

}
