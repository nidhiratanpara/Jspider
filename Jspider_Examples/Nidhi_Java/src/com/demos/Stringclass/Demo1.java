package com.demos.Stringclass;

public class Demo1 {
public static void main(String[] args) {
	String s=new String("java");
	System.out.println(s);
	String s1="JAVA";
	System.out.println(s1);
	System.out.println(s1==s);
	System.out.println(s.equals(s1));
	System.out.println(s.equalsIgnoreCase(s1));
	Object o1="Java";
	System.out.println(o1);
	System.out.println(o1.toString());
	System.out.println(o1.equals("JAva"));
	System.out.println(((String)o1).equalsIgnoreCase("JAva"));
	System.out.println("==========================");
	System.out.println(s.length());
	System.out.println(s.charAt(2));
	for (int i = 0; i < s.length(); i++) {
		System.out.println(s.charAt(i));
	}
	
}
}
