package com.langfundamentals.methods;

//i) No return type + no parameters  
public class Student {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Student s1 = new Student();
		
		//calling the methods 
		s1.read();
		s1.write();
		s1.listen();
		s1.getStudentName();
		System.out.println("main method ended ");
	}

	void listen() {
		System.out.println("listen method called ");

	}

	void read() {
		System.out.println("read method called ");
	}

	void getStudentName() {
		System.out.println("Student name is : " + "Srikanth");
	}

	void write() {
		System.out.println("Write method called !!");
	}

}
