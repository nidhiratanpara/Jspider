package com.demo.interfaces;
interface I
{
	void m1();
	}
class A implements I
{

	@Override
	public void m1() {
		System.out.println("implementation of m1 in A");
		
	}
	}
class B implements I
{

	@Override
	public void m1() {
		System.out.println("implementation of m1 in B");
		
	}
	}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Dosomething(new A());
         Dosomething(new B());
	}
	static void Dosomething(I obj)
	{
		obj.m1();
	}

}
