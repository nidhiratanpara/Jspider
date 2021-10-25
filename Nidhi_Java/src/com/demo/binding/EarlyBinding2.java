package com.demo.binding;


class Y
{}
class Z extends Y
{}
class X
{
	void m1(Y y)
	{
		System.out.println("m1 of Y(y)");
	}
	void m1(Z z)
	{
		System.out.println("m1 of Z(z)");
	}}

public class EarlyBinding2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Y y=new Z();
         X x=new X();
         x.m1(y);
         
	}

}
