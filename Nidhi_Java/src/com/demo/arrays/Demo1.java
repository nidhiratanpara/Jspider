package com.demo.arrays;

public class Demo1 {
public static void main(String[] args) {
	//int[] a=new int[5];
	int[] a={10,20,30,40,50};
	int[] b=a;
	/*a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;*/
	for (int i : a) {
		System.out.println(i);
		
	}
	System.out.println(b[4]);
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
