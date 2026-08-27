package com.langfundamentals;

public class Employee {

	static String orgName = "VCUBE";

	int eid;
	double esal;
	String ename;

	public static void main(String[] args) {
		System.out.println("main method strated ");
		
		String orgName = "VSS";
		
		System.out.println(orgName);
		
		Employee e1 = new Employee();
		
//		The static field Employee.orgName should be accessed in a static way
		System.out.println(e1.orgName);// VCUBE
		System.out.println(Employee.orgName);
		System.out.println(orgName);
		System.out.println(e1.eid);//0 
		
		System.out.println("-------------------------------------");
		Employee e2 = null;
		System.out.println(e2.orgName);//null VCUBE NPE - Not Sure 
//		System.out.println(e2.eid);//null dot any Operation is NullPointerException
		
		
		e1 = null;
		System.out.println(e1.orgName);
		
		System.out.println("main method ended ");
		
	}
}
