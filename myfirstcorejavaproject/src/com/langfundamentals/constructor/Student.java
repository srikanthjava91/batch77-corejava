package com.langfundamentals.constructor;

public class Student {

	int roll_number;
	String name;
	int age;

	// No arg constructor
	Student() {
		System.out.println("no arg constructor called ");
		roll_number = 100;
		name = "unknown";
		age = 18;
	}

//	 Parameterized constructor
//	Why we need this keyword when it is working with different parameter names ..? 
//	For Better Readability !!code maintainability 
	Student(int roll_number, String name, int age) {
		System.out.println("Parameterized constructor called !");
		this.roll_number = roll_number;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Student s1 = new Student();

		s1.roll_number = 101;
		s1.name = "Charan";
		s1.age = 21;
		s1.studentInfo();

		Student s2 = new Student(102, "Eswar", 22);
		s2.studentInfo();

		Student s3 = new Student(103, "Bhanu", 21);
		s3.studentInfo();

		System.out.println("main method ended ");
	}

	void studentInfo() {
		System.out.println("Roll Number : " + roll_number);
		System.out.println("Name of the STudent : " + name);
		System.out.println("Age of the Student  : " + age);
		System.out.println("*************************************");
	}

}
