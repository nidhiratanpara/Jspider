package com.demos.recursivedemos;

//looping example 
//recursivr and looping both are looping are good in industrial programming.
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d=new Demo2();
		d.m1();
		System.out.println("main");
	}
	
	 void m1()
	{
		m2();
		System.out.println("m1");
	}
    void m2()
    {
    	m3();
    	System.out.println("m2");
    }
    void m3()
    {
    	m4();
    	System.out.println("m3");
    }
void m4()
{
	System.out.println("m4");
	}
}
