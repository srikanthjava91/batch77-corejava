package com.langfundamentals.methods;

//no return type + with parameters 
public class Person {

	public static void main() {
		System.out.println("main method started ");

		Person p = new Person();

//		Call by value 
		p.getPersonName("Karun");// arguments
		p.getAge(21);
		p.getHeight(5.8F);

		System.out.println("main method ended ");
	}

//	parameters 
	void getPersonName(String name) {
		System.out.println("Name of the Person : " + name);
	}

	void getAge(int age) {
		System.out.println("Person Age : " + age);
	}

	void getHeight(float height) {
		System.out.println("Person Height : " + height);
	}

}
