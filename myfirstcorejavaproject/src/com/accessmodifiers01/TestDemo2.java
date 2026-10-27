package com.accessmodifiers01;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started from TestDemo2 ");

//		The constructor TestDemo1() is not visible if the constructr is private form TestDemo1 
		TestDemo1 t1 = new TestDemo1();

//		We cannot Access private data members outside of the classes.
//		The field TestDemo1.sid1 is not visible
//		The field TestDemo1.name1 is not visible
//		The method method1() from the type TestDemo1 is not visible

//		System.out.println(t1.sid1);
//		System.out.println(t1.name1);
//		t1.method1();

//		Accessing the default data outside of the class, within the package
		System.out.println(t1.sid2);
		System.out.println(t1.name2);
		t1.method2();
	}

}
