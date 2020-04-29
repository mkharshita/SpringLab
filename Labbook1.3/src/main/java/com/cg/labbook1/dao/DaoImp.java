package com.cg.labbook1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.labbook1.bean.Employee;
import com.cg.labbook1.bean.SBU;

@Component
public class DaoImp implements IDao {
	
	
	private SBU sbu;

	public SBU getSbu() {
		return sbu;
	}

	@Autowired
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}

	@Override
	public String display() {
		return sbu.toString();
	}
	

}
