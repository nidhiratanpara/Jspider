package com.demos.classmembers;
class Aa
{
	static int i;
	void m1()
	{
		System.out.println(i);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Aa a=new Aa();
   a.m1();
   a.i=50;
   a.m1();
	}

}
