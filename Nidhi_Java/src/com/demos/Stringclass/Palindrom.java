package com.demos.Stringclass;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println(ispalindrom("java"));
		System.out.println(ispalindrom("madam"));
	}
	static boolean ispalindrom(String s)
	{
		s=s.toLowerCase();
		System.out.println(s);
		int len=s.length();
		System.out.println(len);
		for (int i = 0; i < len/2; i++) {
			if(s.charAt(i)!=s.charAt(len-1-i))
			return false;
		}
		return true;
		
	}

}
