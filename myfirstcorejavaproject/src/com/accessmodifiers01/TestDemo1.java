package com.accessmodifiers01;

public class TestDemo1 {
	
	public TestDemo1(){
		System.out.println("no-arg consrutor called ");
	}

//	default data members 
	int sid2 = 7;
	String name2 = "MSD";

	void method2() {
		System.out.println("method2 called ");
	}

	// private data members
	private int sid1 = 1;
	private String name1 = "Rahul";

	private void method1() {
		System.out.println("method1 called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from TestDemo1 ");

		TestDemo1 t1 = new TestDemo1();

//		Accessing the private data within the class.
		System.out.println(t1.sid1);
		System.out.println(t1.name1);
		t1.method1();

//		Accessing the default data within the class 
		System.out.println(t1.sid2);
		System.out.println(t1.name2);
		t1.method2();

	}

}
