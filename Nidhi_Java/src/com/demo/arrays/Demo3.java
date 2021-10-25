package com.demo.arrays;

public class Demo3 {

	public static void main(String[] args) {
		int[] arr={10,20,30,40,50,60};
		m1(arr);
		//System.out.println(arr[-1]);
		for (int i : arr) {
			System.out.print(i+",");
		}
	}
	static void m1(int[] a)
	{
		a[0]++;
		a[1]=12;
		
	}

}
