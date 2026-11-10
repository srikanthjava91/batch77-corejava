package com.oops.loanapp;

class Person {
	public Person() {
		System.out.println("Person constructor called ");
	}
}

class Human {

	public Human() {
		super();
		System.out.println("Human constructor called ");
	}

}

class Employee extends Person {

	public Employee() {
		super();
		System.out.println("Employee constructor called ");
	}

}

public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Employee emp1 = new Employee();

	}

}
