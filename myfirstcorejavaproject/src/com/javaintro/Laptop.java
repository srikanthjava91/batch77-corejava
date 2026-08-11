package com.javaintro;

public class Laptop {

	String name = "DELL";

	@Override
	protected void finalize() {
		System.out.println("finalize called ");
	}

	void m1() {
		System.out.println("m1 called ");
		System.out.println("m1 called ");
		System.out.println("m1 called ");
		System.out.println("m1 called ");
		
//		iv) Method Inside the Object
		Laptop l2 = new Laptop();
		System.out.println(l2.name);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Laptop l1 = new Laptop();
		System.out.println(l1);

		Laptop l2 = new Laptop();
		System.out.println(l2);

//		ii) Re-assigning the Objects 
		l2 = l1;

//		iii) Anonymous Objects 
		new Laptop().m1();

		System.gc();

		System.out.println(l1);
		System.out.println(l2);
	}

}
