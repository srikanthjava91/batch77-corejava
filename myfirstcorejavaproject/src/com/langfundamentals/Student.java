package com.langfundamentals;

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;

//7 8 9 10 11 12 13 14  
public strictfp class Student {

	int student_id;
	String student_name;
	int student_age;

//	var age = 21;//'var' is not allowed here

	void hello$() {
		System.out.println("hello method called ");
	}

	void _$welcome() {

	}

	public static void main(String[] sri) throws InterruptedException {

		var age = 21;
		var name = "Karun";
		
		Thread.sleep(1000);

		Student s1 = new Student();

		Scanner sc = new Scanner(System.in);

		System.out.println(s1.student_id);
		System.out.println(s1.student_name);
		System.out.println(s1.student_age);
		s1.hello$();

	}
}
