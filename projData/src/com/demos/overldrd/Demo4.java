package com.demos.overldrd;

public class Demo4 {
	public static void main(String[] args)
	{
		System.out.println(search());
	    System.out.println(search(20));
		
	}
	static boolean search(int a)
	{
		System.out.println("string");
		return true;
	}
	static int search()
	{
		System.out.println("int method");
		return 20;
	}

}
