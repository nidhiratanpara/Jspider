package com.demo.casting;

class A
{
	void m1()
	{
		System.out.println("m1");
	}
	}
class B extends A
{
	

	void m2()
	{
		System.out.println("m2");
		//A c=new C();
		//c.m3();
	}
	}
class C extends A
{
	void m3()
	{
		System.out.println("m3");
		//A a=new B();
		//a.m2();
	}
	}

public class Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	A a1=new C();
		B b1=(B)a1;
*/		
		A a1=new A();
		a1.m1();
		a1=new B();
		((B)a1).m2();
		a1=new C();
		((C)a1).m3();
		
		

	}

}
