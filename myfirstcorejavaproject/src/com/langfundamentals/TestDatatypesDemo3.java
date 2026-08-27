package com.langfundamentals;

//== operator checks the values if the data is Primitive.
//But,if the data is Object data type  it checks the address of the object.
public class TestDatatypesDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");

//		Wrapper Caching : 
//		If the data is between -128 to 127 then it allocates same memory so we will get true.
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);//

//		But, If we check more than 127 values are allocating Different memory for every new value so we will get false.
		Integer i5 = 200;
		Integer i6 = 200;
		System.out.println(i5 == i6);//

//		Converting primitive values to Wrapper Object data will consider as Auto-Boxing
		Integer i1 = 10;
//		Integer i1 = Integer.valueOf(10);
		System.out.println(i1);// 10

//		Converting Wrapper Object to primitive data will consider as Auto-Un-boxing.
		int i2 = i1;
//		int i2 = i1.intValue();
		System.out.println(i2);// 10

		System.out.println("main method ended ");
	}

}
