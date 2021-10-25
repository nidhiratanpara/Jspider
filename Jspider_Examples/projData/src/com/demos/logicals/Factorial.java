package com.demos.logicals;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter you no");
		long n=scn.nextLong();
		long fact =1;

		/*long fact=2;
		//long n=5;
		long i=n;
		for( ;i>2; )
		{
			fact*=i;
			i--;
		}*/
		for (int i = 1; i <=n; i++)
		  {
		fact*=i;
	      }
	System.out.println("youfact no = "+n+" fact is "+fact);

	}
}
