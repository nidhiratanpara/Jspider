package com.demos.constructor;




class C
{
	C()
	{
		System.out.println("call C class constructor");
	}
}
class D extends C
{
	D()
	{
		System.out.println("call the D class constructor");
	}
}
class E extends D
{
	E()
	{
		System.out.println("call E class Constructor");
	}
	}

public class Superclasscall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E();

	}

}
