package com.demos.Stringclass;

public class Occurance {
public static void main(String[] args) {
	String s1="java";
	
	int n=s1.length()-s1.replace("a","").length();
	System.out.println(n);
	
	System.out.println("=============");
	String s="banana";
	char c;
	while(s.length()>0)
	{
		c=s.charAt(0);
		int v=s.length()-s.replace(c+"", "").length();
		System.out.println(c+" "+v);
        s=s.replace(c+"","");
        System.out.println(s);
	}
}
}
