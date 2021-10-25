package com.demo.methodhideing;

class Apple
{
	static void m1()
	{
	System.out.println("apple m1");	
	}
	}
class Banana extends Apple
{
	static void m1()
	{
		System.out.println("banana m1");
	}
	}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
         Banana.m1();
	}

}
