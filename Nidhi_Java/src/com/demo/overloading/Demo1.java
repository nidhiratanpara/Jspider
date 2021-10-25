package com.demo.overloading;

public class Demo1 {

	public static void main(String[] args) {
		main();
		main(10);
		
		
		long r=Runtime.getRuntime().freeMemory();
		long r1=Runtime.getRuntime().maxMemory();
		long r2=Runtime.getRuntime().totalMemory();
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
	}

	public static void main(int i) {
       System.out.println("int type argument");		
	}

	public static void main() {
		System.out.println("with out argument");
	}
}
