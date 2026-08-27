package com.langfundamentals.methods;

//9 1 8 2 --- 20 wrong --> 100 methods --> 100+ methods  
//i) No return type + no parameters 
public class Employee {

	// static main method : JVM calls main method
	public static void main(String[] args) {
		System.out.println("main method started ");

		// Calling the static method directly
		welcome();
		Employee.welcome();

		Employee e = new Employee();
		// calling the instance method by using object reference variable
		e.show();
		e.welcome();

		System.out.println("main method ended ");
	}

	// static method
	public static void welcome() {
		System.out.println("Welcome to Vcube Family !!");
	}

	// instance method
	void show() {
		System.out.println("Show your ID card !!");
	}

}
