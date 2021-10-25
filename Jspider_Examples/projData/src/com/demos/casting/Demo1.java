package com.demos.casting;

//upcasting example
//late binding

class A
{
	void m1()
	{
		System.out.println("m1 of class A");
	}
	void m2()
	{
		System.out.println("m2 of class A");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("m1 of class B");
	}
	void m2()
	{
		System.out.println("m2 of class B");
	}
	
}
class C extends A
{
	void m1()
	{
		System.out.println("m1 of class C");
	}
	void m2()
	{
		System.out.println("m2 of class C");
	}
}

public class Demo1 {
	
	

	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		 A a=new A();
		 a.m1();
		 a.m2();
		//upcasting
         a=(A)new B();
         a.m1();
         a.m2();
         a=new C();
         a.m1();
         
         
	}

}
