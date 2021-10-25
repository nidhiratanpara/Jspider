package com.demos.overldrd;

//method overriding//

class A
{
	static void m1()
	{
	System.out.println("m1() in class A");	
	}
	void m2()
	{
		System.out.println("m2() in class A");
	}
	
}
class B extends A
{
    
	static void m1()
    {
    	System.out.println("m1() of B class");
    }
	}
class D extends B
{
	 void m2()
	    {
	    	System.out.println("m2() of B class");
	    }
}


public class Demo2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.m1();
		b.m2();
		D d=new D();
		d.m1();
		d.m2();

	}

}
