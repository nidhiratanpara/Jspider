package com.demos.Stringclass;

public class ImmutableString {

	public static void main(String[] args) {
		String s1="JAVA";
		 s1=s1.toLowerCase();
		System.out.println(s1);
		String s2="JAVA";
		s2=s2.toLowerCase();
		System.out.println(s2);
		
		String s4="C";
		String s5="Programing";
		s4+=s5;
		System.out.println(s4);
		s5+=s4;
		System.out.println(s5);
		String s3="data";
		s3+="structure";
		System.out.println(s3);
		
		
	}
}
