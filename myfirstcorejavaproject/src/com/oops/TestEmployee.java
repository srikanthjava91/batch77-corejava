package com.oops;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		Employee emp2 = new Employee(77,"Gill",200000.00);
		System.out.println(emp2);
		System.out.println(emp2.getEid());
		System.out.println(emp2.getEname());
		System.out.println(emp2.getEsal());
		System.out.println("***************************");

		Employee emp1 = new Employee();

		// Modifying the data
		emp1.setEid(72);
		emp1.setEname("Tilak Varma");
		emp1.setEsal(100000);

		// reading the data
		System.out.println(emp1.getEid());
		System.out.println(emp1.getEname());
		System.out.println(emp1.getEsal());

//		Directly accessing one class data into another class.
//		Whenever the data is private, we cannot access the data outside of the classes.
//		CE : The field Employee.eid is not visible
//		emp1.eid = 72;
//		emp1.ename = "Tilak";
//		emp1.esal = 100000.00;
//		System.out.println(emp1.eid);
//		System.out.println(emp1.ename);
//		System.out.println(emp1.esal);

	}
}
