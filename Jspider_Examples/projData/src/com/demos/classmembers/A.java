package com.demos.classmembers;

public class A {
	
	static int a;
	int j;
	
	static void m1()
	{
		System.out.println(a);
		//System.out.println(j);
		
	}
	
	void m2()
	{
		System.out.println(a);
		System.out.println(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           m1();
           A a=new A();
           a.m2();
	}
	
	

}
