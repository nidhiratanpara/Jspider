package com.demos.methods;

public class PassingOfArgs {
	
	
	static void m1(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           m1(10); 
           m1(20);
           int s=50;
           m1(s);
           m1(s+30);
	}

}
