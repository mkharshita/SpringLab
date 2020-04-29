package com.cg.labbook1.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class SBU {
	private int subCode;
	private String subName;
	private String subHead;
	private List<Employee> empList;
	public int getSubCode() {
		return subCode;
	}
	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubHead() {
		return subHead;
	}
	public void setSubHead(String subHead) {
		this.subHead = subHead;
	}
	@Override
	public String toString() {
		return "SBU [subCode=" + subCode + ", subName=" + subName + ", subHead=" + subHead + ", empList=" + empList
				+ "]";
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
	
}
