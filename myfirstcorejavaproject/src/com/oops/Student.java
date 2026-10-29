package com.oops;

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}

}

public class Student implements Cloneable {

	int sid;
	String sname;
	Address address;

	public Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
