package com.demos.Stringclass;

import java.util.Scanner;

public class Delimeter {
public static void main(String[] args) {
	Scanner scn=new Scanner("java");
	scn.useDelimiter("");
	while(scn.hasNext())
	{
		System.out.println(scn.next());
	}
	//System.out.println(s1);
}
}
