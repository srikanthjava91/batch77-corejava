package com.langfundamentals;

class Student1 {
	int sid;
	String sname;
	Address address;

}

class Address {
	String city;
	String state;
	String country;
}

public class TestDataTypesDemo4 {

	public static void main(String[] args) {

		Student1 s1 = new Student1();

		s1.sid = 101;
		s1.sname = "srikanth";
		s1.address = new Address();

		System.out.println(s1.sid);// 0
		System.out.println(s1.sname);// null
		System.out.println(s1.address);// null

		s1.address.city = "Hyderabad";
		s1.address.state = "TG";
		s1.address.country = "India";

		System.out.println(s1.address.city);
		System.out.println(s1.address.state);
		System.out.println(s1.address.country);
	}
}
