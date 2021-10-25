package com.demo.aggrigtion;

class B 
{
	int i;
	B(int i)
	{
		this.i=i;
	}
	}
class A
{
	B b;
	A(B b)
	{
		this.b=b;
	}
	
	}

public class Demo1 {

	public static void main(String[] args) {
		
		A a=new A(new B(10));
		System.out.println(a.b.i);
	

	}

}
