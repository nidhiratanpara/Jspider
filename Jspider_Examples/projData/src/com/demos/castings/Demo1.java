package com.demos.castings;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//explicitly casting
		//we done using narrowing
		int i=(int) 20.2;
		System.out.println(i);
		
		//implecitily casting
		//done by java automatically wideing
		double d=10;
		System.out.println(d);
		System.out.println('A');
		int a='a';
		System.out.println(a);
		int b='A';
		System.out.println(b);
		System.out.println((int)'a');
		System.out.println("1"+'A');
		System.out.println("1"+'a');
		System.out.println("1"+(int)'a');
		System.out.println("1"+(int)'A');
		System.out.println(1+(int)'A');
		System.out.println(1+(int)'a');
		System.out.println((char)97);

	}

}
