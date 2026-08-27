package com.langfundamentals;

//JVM Will provide default values 
//		-> for numbers it is like 0's
//		-> for Decimal point data 0.0 
//		--> For single char is --> space -->  
//      -> for boolean is is ---> false 

// byte --> short --> int --> long 
public class TestDataTypesDemo1 {

//	more than 127 is not possible 
//	CE : Type mismatch: cannot convert from int to byte
//	By default RHS numeric values are int values.
	byte b = 127;

//	-128 -127 -126 -125 ......0 1 2 3..... 125 126 127 
	byte b1 = (byte) 257;// -126//int to byte Conversion --> Explicit Type casting

//	short means 2 bytes --> 16 bits = 2^15 = -32768 to 32767
//	Type mismatch: cannot convert from int to short
	short s = 32767;
	short s1 = (short) 40000;// int to short Conversion --> Explicit Type casting

//	int means 4 bytes --> 32 bits = 2^31 = -2147483648 to 2147483647 
	int i = 2147483647;
//	The literal 2147483648 of type int is out of range
//	int i1 = 2147483648;

//	long means 8 bytes --> 64 bits  2^63= 
//	The literal 9223372036854775808L of type long is out of range 
	long l = 9223372036854775807L;
	long phone = 9972677655l;//
	int phone1 = (int) phone;

	long l1 = i;// int --> long --> conversion --> Implicit Type casting

//	float is for Decimal point data representation  
//	By default RHS Decimal point is double 
//	Type mismatch: cannot convert from double to float
	float f = 5.9f;
	double d = 75.5;

	float f1 = 7576.123456789F;
	double d1 = 7576.123456789;

	float f2 = 92233720368547758079223372036854775807F;
	double d2 = 92233720368547758079223372036854775807.5;

//	char means 2 bytes = -32768 + 32767 = 65535
//	char range is 0 to 65535
	char c = 'A';// Single quote characters

	char c1 = 65;// ASCII value 65 to 90 --> A --> Z
	char c2 = 97;// ASCII value 91 to 96 --> Special characters 97 to 122 --> a-> z

	char c3 = 77;
	char c4 = 6553;// int --> char --> Implicit Type casting

	int i3 = 'A';// char --> int --> Implicit Type casting

	char c5 = '\u0040';// Unicode or Hex
	char c6 = '\u0021';// Unicode or Hex

	boolean boo = true;

//	boolean boo1 = 0;
//	boolean boo2 = 1;

//	boolean boo3 = TRUE;
//	boolean boo4 = FALSE;

//	boolean boo5 = False;
//	boolean boo6 =  True;

//	boolean boo7 = "true";
//	boolean boo8 = "false";

	public static void main(String[] args) {
		System.out.println("main method started !!");

		TestDataTypesDemo1 t = new TestDataTypesDemo1();

		System.out.println("byte values : " + t.b);// 0
		System.out.println("byte values : " + t.b1);// 0

		System.out.println("short value : " + t.s);// 0
		System.out.println("short value : " + t.s1);// 0

		System.out.println("int value : " + t.i);// 0
		System.out.println("long value : " + t.l);// 0
		System.out.println("long value : " + t.phone);// 0
		System.out.println("long value : " + t.phone1);// 0

		System.out.println("float value : " + t.f);// 0.0
		System.out.println("double value : " + t.d);// 0.0

		System.out.println("float value : " + t.f1);// 0.0
		System.out.println("double value : " + t.d1);// 0.0

		System.out.println("float value : " + t.f2);// 0.0
		System.out.println("double value : " + t.d2);// 0.0

		System.out.println("char value : " + t.c);//
		System.out.println("char value : " + t.c1);//
		System.out.println("char value : " + t.c2);//
		System.out.println("char value : " + t.c3);//
		System.out.println("char value : " + t.c4);//
		System.out.println("char value : " + t.i3);//

		System.out.println(t.c5);
		System.out.println(t.c6);

		System.out.println("boolean value : " + t.boo);// false

		if (t.boo) {
			System.out.println("Good morning Have a Nice day !!");
		}

		System.out.println("main method ended !!");
	}

}
