package com.demos.casting;
class Z
{
}
class Y extends Z
{
}
class X
{
	void m1(Z z)
	{
		System.out.println("m1(z)");
	}
	void m1(Y y)
	{
		System.out.println("m1(y)");
	}
	}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z=new Y();
		X x=new X();
		x.m1(z);

	}

}
