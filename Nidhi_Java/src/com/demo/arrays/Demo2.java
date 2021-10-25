package com.demo.arrays;

public class Demo2 {

	public static void main(String[] args) {
		int[] a1={1,2,3,4,5,6};
		int[] a2={11,22,33,44,55,66};
		m1(a1);
		m1(a2);
		
	
	}
	static void m1(int[] b)
	{
		System.out.println("m1 starts");
		for (int i : b) {
			System.out.print(i+",");
		}
		System.out.println("m1 ends");
	}

}
