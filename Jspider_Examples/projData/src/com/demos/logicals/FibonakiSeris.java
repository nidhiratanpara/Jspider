package com.demos.logicals;

import java.util.Scanner;

public class FibonakiSeris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter you no");
		long n=scn.nextLong();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 3; i <=n; i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
