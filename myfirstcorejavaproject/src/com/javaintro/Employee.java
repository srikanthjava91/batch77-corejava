package com.javaintro;

//Blocks will execute automatically 
//Static block executes whenever the class loads
//instance block executes whenever the object is created 
public class Employee {
	static Employee e1 = new Employee();

	{
		System.out.println("instance block called ");
		Employee e1 = new Employee();
	}

	static {
		System.out.println("static block called ");
	}
 
	public static void main(String args[]) {
		System.out.println("main method started ");

		System.out.println("main method ended ");
	}

}
