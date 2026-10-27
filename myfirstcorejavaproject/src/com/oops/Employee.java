package com.oops;

//DTO : Data Transfer Object 
//POJO : Plain Old Java Object 
//Data Model 
public class Employee {

	// private variables
	private int eid;
	private String ename;
	private double esal;

	// toString() override
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

	// no-arg constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Employee(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	// Setters & Getters
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename + "-JFS-VCUBE";
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

}
