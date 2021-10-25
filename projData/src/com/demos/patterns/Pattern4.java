package com.demos.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            for(int i=1;i<=5;i++)
            {
            	for(int j=1;j<=5;j++)
            	{
            		//for n number 
            		//if(i==j || j+j==n+1
            		if(i==j ||i+j==6)
            		{
            		System.out.print("*");
            		}
            		else {
						System.out.print(" ");
					}
            	}
            	System.out.println("");
            }
	}

}
