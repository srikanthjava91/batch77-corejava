package com.javaintro;

public class Customer extends Object {

	static Customer c = new Customer();

	@Override
	protected void finalize() {
		System.out.println("finalize method called !");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		System.out.println(c);

		Customer c1 = new Customer();// Object Creation
		System.out.println(c1);// Address of the object --> 1dbd16a6

		Customer c2 = new Customer();
		System.out.println(c2);// 7ad041f3

		Customer c3 = new Customer();
		System.out.println(c3);// 251a69d7

//		i) Nullifying the Objects 
		c1 = null;
		c2 = null;
		c3 = null;

//		Runs the garbage collector.
		System.gc();

//		int i1 = 0x1dbd16a6;
//		System.out.println(i1);
//		System.out.println(c1.hashCode());

	}
}
