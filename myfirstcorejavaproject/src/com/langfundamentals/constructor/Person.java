package com.langfundamentals.constructor;

public class Person {

	String name;
	int age;
	double salary;

	public Person() {
		System.out.println("no- arg constructor called ");
	}

	public Person(String name, int age, double salary) {
		super();
		System.out.println("Person 3 arg constructor called ");
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Person");
	}

}

//Implicit super constructor Person() is undefined for default constructor. 
//Must define an explicit constructor
class Employee extends Person {
	public static void main(String[] args) {
		System.out.println("main method started from Employee");
		Employee emp1 = new Employee();
		emp1.empInfo();

	}

	void empInfo() {
		System.out.println("Name of the EMployee : " + name);
		System.out.println("Age of the EMployee : " + age);
		System.out.println("Salary of the EMployee : " + salary);
	}
}
