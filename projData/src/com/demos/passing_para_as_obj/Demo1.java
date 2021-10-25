package com.demos.passing_para_as_obj;


class A{
	int i;
	A(int i)
	{
		this.i=i;
	}
}
class B
{
	void m1(A a)
	{
		System.out.println("m1 starts");
		System.out.println(a.i);
		System.out.println("m1 ends");
	}
}


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B();
		b.m1(new A(10));
		A a=new A(20);
		b.m1(a);
	}

}
