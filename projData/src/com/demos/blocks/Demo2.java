package com.demos.blocks;

class B
{
	
	static 
	{
		System.out.println("b class static");
	}
	
	B()
	{
		System.out.println("default");
	}
	}

public class Demo2 {
	
	static 
	{
		System.out.println("Static block");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method");
new B();
	}

}
