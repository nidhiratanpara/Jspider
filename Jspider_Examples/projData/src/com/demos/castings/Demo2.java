package com.demos.castings;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		m1(i);
		m1((double)i);
		m2(i);
	}
	static void m1(int a)
	{
		System.out.println(a);
		System.out.println("m1 int a");
	}
	static void m1(double d)
	{
		System.out.println(d);
		System.out.println("m1 double d");
	}

	static void m2(double a)
	{
		System.out.println(a);
		System.out.println("m2 int a");
	}

}
