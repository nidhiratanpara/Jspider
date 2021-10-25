package com.demo.interfaces;

interface Y
{
	void m1();
	}
interface Z
{
	void m2();
	}
interface X extends Z,Y
{
	void m3();
	
}
class Aa implements X
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 in interface Y");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 in interface Z");
	}
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 in interface X");
	}
	}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
           Z z=new Aa();
           z.m2();
           Y y =new Aa();
           y.m1();
           X x=new Aa();
           x.m1();
           x.m2();
           x.m3();
           
	}

}
