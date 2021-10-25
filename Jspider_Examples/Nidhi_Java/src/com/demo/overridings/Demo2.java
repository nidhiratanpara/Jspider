package com.demo.overridings;


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
	@Override
	void m1()
	{
		System.out.println("m1 of class B");
	}
	}
class C extends B
{
	@Override
	void m2()
	{
		System.out.println("m2 of class C");
	}
	void m3()
	{
		System.out.println("m3 of class C");
	}}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		a.m1();
		a.m2();
		B b=new B();
		b.m1();
		b.m2();
        C c=new C();
        c.m1();
        c.m2();
       	c.m3();
	}

}
