package com.demo.exception;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter any no");
		int a=scn.nextInt();
		int b=0;
		int c;
		try{
			System.out.println("try starts");
			c=a/b;
			System.out.println("try ends");
		}catch(Exception e)
		{
			System.out.println("executing catch");
			c=a/2;
			System.out.println(c);
		}
		//try{}
		//finally{}
		
	}

}
