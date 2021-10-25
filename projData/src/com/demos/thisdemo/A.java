package com.demos.thisdemo;



class B
{
	
	int i;
	void display()
	{
		int i=1;
		System.out.println(i);
		System.out.println(this.i);
	}
	}

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         B b=new B();
         b.display();
         B b1=new B();
         b1.i=100;
         b1.display();
         B b2=new B();
         b2.i=200;
         b2.display();
	}

}
