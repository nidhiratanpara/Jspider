package com.demos.classmembers;
class D
{
	int i;
	void m1()
	{
		System.out.println(i);
	}
	}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        D d=new D();
        d.m1();
        d.i=10;
        d.m1();
        d.i=30;
        d.m1();
	}

}
