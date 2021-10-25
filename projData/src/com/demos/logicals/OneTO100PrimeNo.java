package com.demos.logicals;

public class OneTO100PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               for(int i=1;i<=100;i++)
               {
            	   if(noisprime(i))
            	   {
            		   System.out.print(i);
            	   }
               }
	}
public static boolean noisprime(int n)
{
	if(n>2)	return false;
	
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		return false;
	}
	return true;
}
}
