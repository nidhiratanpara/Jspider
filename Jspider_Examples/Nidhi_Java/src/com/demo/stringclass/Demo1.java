package com.demo.stringclass;

public class Demo1 {
public static void main(String[] args) {
	String s="java";
	System.out.println(s);
	String s1=new String("jAva");
	System.out.println(s1);
	System.out.println(s1==s);
	System.out.println(s.equals(s1));
	System.out.println(s.equalsIgnoreCase(s1));
	
	Object o1="mava";
	System.out.println(o1);
	System.out.println(o1.equals("Mava"));
	//System.out.println(o1.equalsIgnoreCase("Mava"));
	System.out.println(((String)o1).equalsIgnoreCase("Mava"));
		
}
}
