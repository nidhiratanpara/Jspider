package com.demos.blocks;

class A
{
static 
{
	System.out.println("static block");
	}
{
System.out.println("Non-satic block");	
}
A()
{
	System.out.println("constructor");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new A();
new A();
	}

}
