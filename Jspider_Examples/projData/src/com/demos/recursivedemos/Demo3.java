package com.demos.recursivedemos;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         m(1);
	}


static void m(int a)
{
	
	System.out.println(a);
	if(a==3)
		return;
		m(a++);
		System.out.println(a);
		return;
	
	}
}
