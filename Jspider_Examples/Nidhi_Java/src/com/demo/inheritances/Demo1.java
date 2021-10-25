package com.demo.inheritances;

class A extends Object
{
	
	A()
	{
		System.out.println("A default constructor");
	}
	int i=10;
	void m1()
	{
	System.out.println(i);
	}
}
class B extends A
{
	B()
	{
		System.out.println("B default constructor");
	}
	int j=20;
	void m2()
	{
		System.out.println(j);
		System.out.println(i);
	}
	}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           B b=new B();
           b.m1();
           b.m2();
	}

}
