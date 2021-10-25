package com.demos.abstractdemos;

/*ex of abstract class*/
//upcasting
//method overloading
//late binding
abstract class A
{
	abstract void m1();
}
class B extends A
{
	void m1()
	{
		System.out.println("m of class B");
	}
}
class C extends A
{
	void m1()
	{
		System.out.println("m of class c");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.m1();
		a=new C();
		a.m1();

	}

}
