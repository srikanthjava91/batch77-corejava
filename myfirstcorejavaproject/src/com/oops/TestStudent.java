package com.oops;

public class TestStudent {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address add = new Address("Hyderabad");
		Student s1 = new Student(101, "Srikanth", add);

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("--------------------------");

		Student s2 = (Student) s1.clone();
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("--------------------------");
		System.out.println("****************************************");
		
		s2.sname = "C V N Srikanth";
		s2.address.city = "Bangalore";
		
		System.out.println(s1.sid);//101
		System.out.println(s1.sname);//Srikanth
		System.out.println(s1.address.city);//Bangalore
		System.out.println("--------------------------");
		System.out.println(s2.sid);//101
		System.out.println(s2.sname);//C V N Srikanth 
		System.out.println(s2.address.city);//Bangalore
		
		


	}

}
