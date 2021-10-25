package com.demo.patterns;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n=7;
		  int space=n;
             for(int i=1;i<=n;i++)
             {
            	 for(int k=1;k<=space;k++)
            	 {
            		 System.out.print(" ");
            	 }
            	 for (int j=1;j<=i;j++)
            	 {
            		 System.out.print("* ");
            		// System.out.print(" ");
            	 }
            	 System.out.println();
            	 space--;
             }
            
	}
}