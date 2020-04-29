package com.cg.labbook1.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {

	
	@Value("${subCode}")
	private int subCode;
	@Value("${subName}")
	private String subName;
	@Value("${subHead}")
	private String subHead;
	
	
	public SBU(int subCode, String subName, String subHead) {
		super();
		this.subCode = subCode;
		this.subName = subName;
		this.subHead = subHead;
	}
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "SBU [subCode=" + subCode + ", subName=" + subName + ", subHead=" + subHead + "]";
	}
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
	
	
}
