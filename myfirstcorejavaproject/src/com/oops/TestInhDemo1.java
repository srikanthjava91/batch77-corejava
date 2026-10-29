package com.oops;

public class TestInhDemo1 extends Object {
	
	String name = "test";
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finlize method called ");
	}
	
	

	@Override
	public String toString() {
		return "TestInhDemo1 [name=" + name + "]";
	}



	public static void main(String[] args) {
		

		TestInhDemo1 t1 = new TestInhDemo1();
		TestInhDemo1 t2 = new TestInhDemo1();
		TestInhDemo1 t3 = new TestInhDemo1();
		t3 = t2;

		System.out.println(t1.equals(t2));// false
		System.out.println(t3.equals(t2));

		System.out.println(t1);// 2b2fa4f7
		System.out.println(t1);
		int a = 0x2b2fa4f7;
		System.out.println(a);
		System.out.println(t1.hashCode());
		
		System.gc();

		System.out.println(t1.getClass());
		//class com.oops.TestInhDemo1 
		//com.oops.TestInhDemo1
		//class TestInhDemo1
		//TestInhDemo1@2b2fa4f7
	}

}
