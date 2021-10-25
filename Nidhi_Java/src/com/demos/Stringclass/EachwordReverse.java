package com.demos.Stringclass;

public class EachwordReverse {
public static void main(String[] args) {
	String s="Java is very easy";
	String[] arr=s.split(" ");
	
	String s1=arr[arr.length-1];
	for (int i =arr.length-2; i>=0; i--) {
		
		s1=s1+" "+arr[i];
		
	}
	System.out.println(s1);
}
}
