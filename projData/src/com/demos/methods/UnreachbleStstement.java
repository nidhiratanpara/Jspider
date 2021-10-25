package com.demos.methods;

public class UnreachbleStstement {
	
	
	int m1()
	{
		
		int a=10;
		int b=20;
		int c=a+b;
		if(c==30)
		{
		return c;
		}
		return 10;
		//this is unreachble statement
		//System.out.println("hello");
	}
	
	static int m2()
	{
		int a=1;
		System.out.println(a++);
		return a++;
	}
	 
	static int m3(int n)
	{
		System.out.println(n);
		return n;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnreachbleStstement a=new UnreachbleStstement();
		System.out.println(a.m1());
		System.out.println(a.m2());
		System.out.println(a.m3(10));

	}

}
