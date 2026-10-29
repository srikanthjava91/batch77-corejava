package com.oops.copy;

class Employee {
	int eid;
	double salary;
	String name;
	Address1 add;

	public Employee(int eid, double salary, String name, Address1 add) {
		super();
		this.eid = eid;
		this.salary = salary;
		this.name = name;
		this.add = add;
	}
	
	//Copy Constructor
	public Employee(Employee emp) {
		this.eid = emp.eid;
		this.salary = emp.salary;
		this.name = emp.name;
		this.add = new Address1(emp.add);//Deep Copy
	}

}

class Address1 {

	String city;

	public Address1(String city) {
		super();
		this.city = city;
	}
	
	//Copy Constructor
	public Address1(Address1 add) {
		this.city = add.city;
	}

}

public class TestDeepCopy {

	public static void main(String[] args) {
		
		Address1 add = new Address1("Vijayawada");
		Employee emp1 = new Employee(1, 500000.00, "Rohit", add);
		
		Employee emp2 = new Employee(emp1);
		System.out.println(emp2.eid);
		System.out.println(emp2.name);
		System.out.println(emp2.salary);
		System.out.println(emp2.add.city);
		
		emp2.add.city = "Hyderabad";
		System.out.println(emp2.add.city);
		System.out.println(emp1.add.city);
		

	}

}
