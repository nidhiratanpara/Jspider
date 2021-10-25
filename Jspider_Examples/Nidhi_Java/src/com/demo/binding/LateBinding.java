package com.demo.binding;


class A
{
	void m1()
	{
		System.out.println("m1 in A");
	}
	}
class B extends A
{
	void m1()
	{
		System.out.println("m1 in B");
	}}
class C extends B
{
	void m1()
	{
		System.out.println("m1 in C");
	}
	}
public class LateBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          A a=new A();
          a.m1();
          a =new B();
          a.m1();
          a=new C();
          a.m1();
		
		
	}

}
