package com.demos.methods;

public class IncDecoperation {
	
	
	static int m1(int a)
	{
		return a++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=0;
		int c=(a++)+(++b);
		System.out.println(c);
		m1(c);
		System.out.println(c);
	}

}
