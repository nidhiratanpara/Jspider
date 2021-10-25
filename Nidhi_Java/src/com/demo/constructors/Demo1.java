package com.demo.constructors;
class A
{
	
	}
class B
{
	B(int a)
	{
		System.out.println("one para");
	}

}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new A();
        //new B();
        new B(10);
	}

}
