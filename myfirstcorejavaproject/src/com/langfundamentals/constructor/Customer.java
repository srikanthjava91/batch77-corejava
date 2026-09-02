package com.langfundamentals.constructor;

//In Java, If there are no constructors in a class, 
//Java Compiler creates internally a constructor can consider as "default constructor".
//Note : if a class contains any other constructors then
//Java compiler will not create a default constructor.

//Q) Already, Java Compiler is Creating a default constructor then why we need no-arg constructor..? 
//ans1 : if a class contains any other constructors then 
//Java compiler will not create a default constructor, 
//in such cases if we want to create object without passing values then we need no-arg constructor.

//ans2 : Instead of JVM providing the default values for instance data, 
//As a Developer we want to provide other values based on requirements then we can choose no-arg constructor.
public class Customer {

	int cid;
	String name;

	// No-arg constructor
	Customer() {
		System.out.println("no-arg constructor called ");
		cid = 100;
		name = "Unknown";
	}

	static void hello() {
		Customer c = new Customer();
		c.show();
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		hello();

		// Customer(); --> constructor calling
//		The below Object is created with the help of default constructor.
//		The below Object is created with the help of no-arg constructor
		Customer c = new Customer();
		c.show();

		Customer c1 = new Customer();
		c1.show();

//		Scanner sc = new Scanner();
//		The below Object is creates with the help of no-arg constructor.
		String s = new String();

	}

	void show() {
		System.out.println("Customer ID : " + cid);
		System.out.println("Customer Name: " + name);
	}
}
