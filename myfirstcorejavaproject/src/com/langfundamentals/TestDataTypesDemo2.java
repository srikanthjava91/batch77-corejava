package com.langfundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

class Dog {

}

public class TestDataTypesDemo2 {

//	String is a class from java.lang and Object Data Types 
//	String is a Collection of characters storing into single variable with index based.
	String s = "java";// String is a Literal --> SCP : String Constant Pool
	String s1 = new String("Srikanth");// String Object--> Heap Memory

//	Type mismatch: cannot convert from int to BigInteger
//	BigInteger bi = 100;//200% Invalid 

	String s5 = new String();

	Scanner sc = new Scanner(System.in);
	BigInteger bi1 = new BigInteger("789643543256879798545367754345374657645343765");
	BigInteger bi2 = new BigInteger("789643543256879798545367754345374657645343765");

	BigDecimal bd;

	Integer i = 100;// Primitive value to Wrapper Object Data Will consider as : Auto-Boxing
	Short sh;
	Character c;

//	Dog d = "Puppy";//200 % Invalid : Type mismatch: cannot convert from String to Dog

	public static void main(String[] args) {
		System.out.println("main method started !");

		TestDataTypesDemo2 t = new TestDataTypesDemo2();
		System.out.println("String value : " + t.s);// null
		System.out.println("String value : " + t.s1);// null

		System.out.println("BigInteger value is  : " + t.bi1);// 0

		System.out.println(10 + 100);// 110
//		The operator + is undefined for the argument type(s) java.math.BigInteger, java.math.BigInteger
//		System.out.println(t.bi1 + t.bi2);

		System.out.println(t.bi1.add(t.bi2));// Addition
		System.out.println(t.bi1.multiply(t.bi2));// Addition

		System.out.println("BigDecimal value is : " + t.bd);// 0.0
		System.out.println("Integer value is : " + t.i);// 0
		System.out.println("Short valueis : " + t.sh);// 0
		System.out.println("Character  value is  : " + t.c);//
//		System.out.println("Dog value is " + t.d);// null

		System.out.println("main method ended !");

	}
}
