package com.demos.Stringclass;

public class IndexOf {

	public static void main(String[] args) {
		  String s="  java  developer  ";
		  System.out.println(s);
		  System.out.println(s.indexOf('e'));
		  System.out.println(s.indexOf('J'));
		  System.out.println(s.indexOf("dev"));
		  System.out.println(s.indexOf('e',3));
		  System.out.println(s.indexOf("lo", 1));
		  System.out.println(s.substring(4));
		  System.out.println(s.substring(4,6));
		  System.out.println(s.contains("de"));
		  System.out.println(s.startsWith("j"));
		  System.out.println(s.endsWith("p"));
		  System.out.println(s.trim());
	}

}
