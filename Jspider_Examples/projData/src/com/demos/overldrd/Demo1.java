package com.demos.overldrd;
//method overloading//

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();
		m1(20);
		m1(10,2.30f);

	}
	static void m1() {
		System.out.println("m1()method");
		
	}
	static void m1(int i) {
		System.out.println("m1(int)method");
		
	}
	static void m1(int f ,float g) {
		System.out.println("m1(int,float)method");
		
	}

}
