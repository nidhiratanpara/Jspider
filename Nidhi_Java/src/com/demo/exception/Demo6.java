package com.demo.exception;

import java.util.Scanner;
public class Demo6 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		String s=null;
		int n=0;
		while(true)
		{
			System.out.println("enter a number");
			s=scn.next();
			try
			{
				n=Integer.parseInt(s);
			}
			catch(NumberFormatException e)
			{
				System.out.println("wrong data");
			}
			System.out.println("n="+n);
		}
		
		
	}

}
