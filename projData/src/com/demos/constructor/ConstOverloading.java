package com.demos.constructor;


class Dd
{
	Dd()
	{
		System.out.println();
	}
	Dd(int a)
	{
	System.out.println("int");	
	}
	Dd(String s)
	{
		System.out.println("Srting");	
	}

}

public class ConstOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dd();
		new Dd(5);
		new Dd("nidhi");
             
	}

}
