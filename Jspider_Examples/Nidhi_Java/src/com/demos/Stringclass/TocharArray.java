package com.demos.Stringclass;

public class TocharArray {

	public static void main(String[] args) {
		String s="java Developer";
		char[] c=s.toCharArray();
		for (char d : c) {
			System.out.println(d);
		}
		
		String s1="java Developer";
		String[] as=s1.split("a");
		for (String g : as) {
			System.out.println(g);
		}
	}

}
