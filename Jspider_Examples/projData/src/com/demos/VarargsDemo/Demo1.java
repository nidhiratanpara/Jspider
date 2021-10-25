package com.demos.VarargsDemo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1(10);
		m1(15,20);
		m1(25,30,35);
	}
	
	public static void m1(int...a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
	}

}
