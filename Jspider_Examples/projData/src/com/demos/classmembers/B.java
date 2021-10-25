package com.demos.classmembers;

public class B {
	
	static int i;
	int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=10;
		B b=new B();
		b.j=20;
		i=30;
		System.out.println(i);
		k++;
		System.out.println(k);
		B b1=new B();
		b1.j=60;
		System.out.println(b1.j);
		

	}

}
