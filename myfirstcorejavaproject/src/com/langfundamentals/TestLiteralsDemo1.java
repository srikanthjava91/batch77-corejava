package com.langfundamentals;

public class TestLiteralsDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

//		Decimal Literals : Any natural numbers will consider as Decimal 
//		Decimal numbers bas is 10 - 0 to 9 
		int a1 = 123;
		int a2 = 1230;
		int a3 = 00;

//		Octal Literals : Any number starts with zero will consider as Octal
//		Octal number base is 8 - 0 to 7 
//		0 1*8^2 +2*8^1 +3*8^0  = 64 + 16 + 3 = 83
		int a4 = 0123;
		int a5 = 0456;
		int a6 = 0676;
//		int a7 = 0786;//invalid 

//		Hexa-Decimal Literals : ANy number starts with 0X or 0x will consider as Hexa-Decimal 
//		Hexa-Decimal 16 - 0 to 9 & a-f/A-F

//		0 1*16^2 +2*16^1 +3*16^0 = 256 + 32 + 3 = 291
		int a7 = 0x123;

//		a b c --> 10*16^2 +11*16^1 +12*16^0 = 2560 + 176 + 12 = 2748
		int a8 = 0xabc;
		int a9 = 0xaab123;
		int a10 = 0XDad;
		int a11 = 0Xbee;
		int a12 = 0Xbee;
		
//		Binary Literals : Any numbers starts with 0b will consider as Binary Literals 
//		Binary Literals base is 2 --> 0 1 
		
//		1*2^3 +0*2^2 +1*2^1 +0*2^0 = 8 + 0 + 2 + 0 = 10 
		int a13 = 0b1010;//10 
		int a14 = 0b11100111;//10 

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);// 83
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a13);
		System.out.println(a14);
		

		System.out.println("main method ended ");
	}

}
