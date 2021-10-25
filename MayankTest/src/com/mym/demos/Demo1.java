package com.mym.demos;

import java.util.ArrayList;
import java.util.List;

class A{
	int i;
	A()
	{}
	A(int x)
	{
		i=x;
	}
	
	public void geti(){
		System.out.println(i);
	}
	
}

class B extends A{
	
	int i;
	B(int x)
	{
		super(x);
		i=x;
	}
	
	public void geti(){
		System.out.println(super.i);
	}
}


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lst = new ArrayList<>();
		A a = new A(2);
		B b = new B(3);
	
		System.out.println("A is " + a.i);
		b.geti();
		
		System.out.println("B is " + b.i);
	    
		
	}

}
