package com.demos.Stringclass;

import java.util.Scanner;

public class ReplaceDemo {
public static void main(String[] args) {
	String s="deepikapadukone";
	String s1="";
	String s2=s;
	
	System.out.println(s.replace('e','E'));
	System.out.println(s.replace("padu", "PADU"));
	System.out.println(s.replace('x','v'));
	System.out.println(s.replace("a",""));
	System.out.println(s.replaceAll("e","n"));
	System.out.println(s.replaceAll(s2, s1));
	System.out.println(s.replaceFirst("e", "p"));
	System.out.println(s);
	
	
	
	
	Scanner scn=new Scanner(s);
	char c=scn.next().charAt(3);
	System.out.println(c);
	
}
}
