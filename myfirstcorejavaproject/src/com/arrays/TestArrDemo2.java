package com.arrays;

//WAP to print names using Array ..? 
public class TestArrDemo2 {

	public static void main(String[] args) {

		String[] names = new String[5];// 0 1 2 3 4

//		System.out.println(names);// Address of the Object

		names[0] = "Gill";
		names[1] = "Rohit";
		names[2] = "Virat";
		names[3] = "Iyer";
		names[4] = "K L Rahul";

		for (String name : names) {
			if(name.contains("h")) {
				System.out.println(name);
			}
		}

//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}

	}

}
