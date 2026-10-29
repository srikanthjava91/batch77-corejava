package com.oops;

class Customer implements Cloneable {

	int cid;
	String cname;
	Address1 address1;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Customer(int cid, String cname, Address1 address1) {
		this.cid = cid;
		this.cname = cname;
		this.address1 = address1;
	}

}

class Address1 {

	String city;

	public Address1(String city) {
		this.city = city;
	}

}

public class TestShallowCopyDemo2 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address1 add = new Address1("Pune");
		Customer c1 = new Customer(1, "Rohit", add);
		System.out.println(c1.cid);
		System.out.println(c1.cname);
		System.out.println(c1.address1.city);
		
		Customer c2 = (Customer)c1.clone();
		c2.cid =2;
		c2.cname ="Ram";
		c2.address1.city = "Hyderabad";
		
		System.out.println(c2.cid);//2
		System.out.println(c2.cname);//Ram
		System.out.println(c2.address1.city);//Hyderabad
		
		System.out.println(c1.address1.city);//

	}
}
