package com.demos.loops;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=a+b;
		System.out.println(c);
	}

}
