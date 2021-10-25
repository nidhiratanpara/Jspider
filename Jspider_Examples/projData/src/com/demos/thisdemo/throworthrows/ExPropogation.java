package com.demos.thisdemo.throworthrows;

public class ExPropogation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("main starts");
           m1();
           System.out.println("main ends");
	}
	static void m1()
	{
		System.out.println("m1 stsrts");
		try
		{
		m2();
	    }
		catch (ArithmeticException e) {
			System.out.println("expection handled in m1()");
				
			}
    }
	static void m2()
	{
		System.out.println("m2 starts");
		int a=25/0;
		System.out.println("m2 ends");
	}

}
