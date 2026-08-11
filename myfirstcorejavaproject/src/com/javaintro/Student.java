package com.javaintro;

public class Student {

	int sid = 100;
	String sname = "Unknown";

	static int collegeId = 444;
	static String collegeName = "VS-IT";

	public static void main(String[] args) {

		Student eswar = new Student();

		collegeId = 555;
		collegeName = "Vcube";

		eswar.sid = 101;
		eswar.sname = "Eswar";

		System.out.println("College ID : " + collegeId);
		System.out.println("College Name : " + collegeName);
		System.out.println("Student ID :  " + eswar.sid);
		System.out.println("Student Name :  " + eswar.sname);

		Student ch = new Student();
		ch.sid = 102;
		ch.sname = "Charan";
		System.out.println("College ID : " + collegeId);
		System.out.println("College Name : " + collegeName);
		System.out.println("Student ID :  " + ch.sid);
		System.out.println("Student Name :  " + ch.sname);

		Student bh = new Student();
		// Re-Intializing the data
		collegeId = 666;
		collegeName = "VSS";
		bh.sid = 103;
		bh.sname = "Bhanu";

		System.out.println("College ID : " + collegeId);
		System.out.println("College Name : " + collegeName);
		System.out.println("Student ID :  " + bh.sid);
		System.out.println("Student Name :  " + bh.sname);

		Student sr = new Student();
		sr.sid = 104;
		sr.sname = "Srujan";
		System.out.println("College ID : " + collegeId);// 666
		System.out.println("College Name : " + collegeName);// VSS
		System.out.println("Student ID :  " + sr.sid);// 104
		System.out.println("Student Name :  " + sr.sname);// Srujan

		Student vr = new Student();
		vr.sid = 105;
		vr.sname = "Varshith";

		System.out.println("College ID : " + collegeId);//
		System.out.println("College Name : " + collegeName);
		System.out.println("Student ID :  " + vr.sid);
		System.out.println("Student Name :  " + vr.sname);

	}

}
