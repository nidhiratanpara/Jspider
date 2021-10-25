package com.demos.exceptions;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scn=new Scanner(System.in);
  
   int n=0;
   while(true)
   {
	   System.out.println("enter a no");
	   String s=scn.next();
	   try
	   {
		   n=Integer.parseInt(s);
		   break;
	   }catch(NumberFormatException e)
	   {
		   System.out.println("wrong data");
	   }
	   
   }
   System.out.println("N="+n);
	}

}
