package com.demos.Stringclass;

public class EachWordRevers {

	public static void main(String[] args) {
		String s="java is very easy";
		String[] arr=s.split(" ");
		String s1=reverse(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			s1=s1+" "+reverse(arr[i]);
		}
		System.out.println(s1);
	}
	static String reverse(String s)
	{
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2+=s.charAt(i);
		}
		return s2;
		
	}

}
