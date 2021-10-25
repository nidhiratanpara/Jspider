package com.demos.logicals;
import java.util.Scanner;

public class SumofNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn=new Scanner(System.in);
      int sum=0;
      System.out.println("enter num:");
      int n=scn.nextInt();
      for (int i=1; i <=n; i++)
      {
    	  sum += i;
	   }
      System.out.println("Sum of 1 to"+" "+ n+" " +"no is:"+sum);
      
	}

}
