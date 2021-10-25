package com.demos.thisdemoprog;


class A
{
	
	
	A()
	{
		this(10);
		System.out.println(" 0 args");
	}
	A(int a)
	{
		this(20,30);
		System.out.println(" 1 args");
	}
	A(int a,int b)
	{
		
		System.out.println(" 2 args");
	}
	}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new A();
	}

}
