package com.demo.abstractn;

 abstract class A
{
	abstract void m1();
	 }
 class B extends A
 {
	  void m1()
	 {
		 System.out.println("m1 of class B");
	 }
 }
 class C extends B
 {
	 void m1()
	 {
		 System.out.println("m1 of class C");
	 }
 }

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A a=new B();
         a.m1();
         a=new C();
         a.m1();
	}

}
