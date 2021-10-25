package com.demos.methods;

public class StaticMethodDemo {
	
	static int m1()
	{
		System.out.println("executing m1()");
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		int i=m1();
		System.out.println("i="+i);
		m1();
		System.out.println(m1());
		int j=m1()+m1();
		System.out.println("J="+j);
		if(m1()==10)
		{
			System.out.println("body executing");
		}
		
	}

}
