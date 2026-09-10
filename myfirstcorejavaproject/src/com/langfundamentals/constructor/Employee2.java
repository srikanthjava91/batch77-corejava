package com.langfundamentals.constructor;

public class Employee2 {

	int eid;
	String name;

	public Employee2() {
		System.out.println("No arg constructor called !!");
	}

//	 copy Constructor !!
	Employee2(Employee2 emp) {
		this.eid = emp.eid;
		this.name = emp.name;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Employee2 emp1 = new Employee2();
			emp1.eid = 101;
			emp1.name = "Srikanth";
		emp1.display();

		Employee2 emp2 = new Employee2(emp1);
		emp2.display();

		System.out.println(emp1);
		System.out.println(emp2);

	}

	void display() {
		System.out.println("Employee iD : " + eid);
		System.out.println("Employee Name : " + name);
	}
}
