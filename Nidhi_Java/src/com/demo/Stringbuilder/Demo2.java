package com.demo.Stringbuilder;

import java.util.Arrays;
import java.util.Comparator;
class Leang implements Comparator
{

	@Override
	public int compare(Object a, Object b) {
		return ((String)a).length()-((String)b).length();
	}}
public class Demo2 {
	
	public static void main(String[] args) {
		System.out.println(concatination("agv","hudo"));
		String[] a={"nidhi","vasu","ajit","jadu","mayank"};
		Arrays.sort(a);
		Arrays.sort(a,new Leang());
		for (String string : a) {
			System.out.println(string);
		}
		
		
		
	}
	static String concatination (String s1,String s2) 
	{
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		char[] c3=new char[s1.length()+s2.length()];
		//System.out.println(c3);
		int i = 0;
		for (; i < c1.length; i++) {
			c3[i]=c1[i];
		}
		for (int j = 0; j < c2.length; j++,i++) {
			c3[i]=c2[j];
		}
		String s3=new String(c3);
		return s3;
		
	}

}
