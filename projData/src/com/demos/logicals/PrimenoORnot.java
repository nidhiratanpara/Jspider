package com.demos.logicals;
import java.util.Scanner;

public class PrimenoORnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st logic
	/*	Scanner scn=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=scn.nextInt();
        if(n<2)
        {
        	System.out.println("no is not prime");
        	return;
        }
        for(int i=2;i<=n/2;i++)
        {
        	if(n%i==0)
        	{
        		System.out.println("no is not a prime");
        		return;
        	}
        }
        System.out.println("no is a prime");
        */
        
        
        
        
        //2nd logic
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=scn.nextInt();
        int flag=1;
        for(int i=2;i<=n/2;i++) {
        	if(n%2==0)
        	{
        		flag=0;
        		System.out.println("no is not prime");
        		break;
        	}
        }
        if(flag==1)
        {
        	System.out.println("prime no");
        }
	}

}
