package com.demo.casting;

class D
{
	void m1()
	{
		System.out.println("m1");
	}
	}
class E extends D
{
	void m2()
	{
		System.out.println("m2");
	}
	
	}
class F extends E
{
	void m3()
	{
		System.out.println("m3");
	}
	}


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		D d=new F();
		F f=(F)d;
		f.m1();
		f.m2();
		f.m3();
		E e=(E)d;
		e.m1();
		e.m2();
	}

}
