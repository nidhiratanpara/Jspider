package com.demo.overloading;

public class Demo {
public static void main(String[] args) {
	
	Demo d=new Demo();
	System.out.println(d.m(10));
	System.out.println(d.m());
	
}

 int m(int a)
{
	return 10;
}
 double m()
{
	return 2.0;
	}
}
