package com.langfundamentals;

public class Student2 {

	// Primitive + static
	static int collegeId = 555;
	// Object + static
	static String collegeName = "Vcube";

	// primitive + instance
	int rollno = 0;
	// Object + instance
	String name = "unknown";

	public static void main(String[] args) {

//		Primitive + Local 
		int collegeId = 666;
//		Object + local 
		String collegeName = "VSS";

//		The local variable a may not have been initialized
//		JVM will not provide default values for local variables.
//		Illegal modifier for parameter a; only final is permitted
//		For local variables, we cannot use Access modifiers & non Access modifiers except final.
		int a;
//		System.out.println(a);//CE

//		1st-way : static data we can access directly
		System.out.println(collegeId);
		System.out.println(collegeName);

//		2nd-way : static data we can access by using class name 
		System.out.println(Student2.collegeId);
		System.out.println(Student2.collegeName);

		Student2 s1 = new Student2();

//		3rd-way : static data we can access by using Object reference variable 
		System.out.println(s1.collegeId);
		System.out.println(s1.collegeName);

//		But, instance data we can access only by using Object reference variables 
		System.out.println(s1.rollno);
		System.out.println(s1.name);

	}

}
