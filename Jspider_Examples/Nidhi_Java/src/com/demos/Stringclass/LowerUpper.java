package com.demos.Stringclass;

import java.util.concurrent.atomic.AtomicInteger;

public class LowerUpper {
private static int Atomicint;
public static void main(String[] args) {
	
	System.out.println(ChangeCase("NIDhi"));
	System.out.println(ChangeCase("MAYANK"));
}
static String ChangeCase(String s)
{
	
	System.out.println((int)'A');
	System.out.println((int)'Z');
	System.out.println((int)'a');
	System.out.println((int)'z');
	// AtomicInteger i=new;
	String s2="";
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c>='A' && c<='Z' )
		{
			s2+=Character.toLowerCase(c);
		}
		else{
			s2+=Character.toUpperCase(c);
		}
	}
	return s2;
}
}
