package com.demo.comparator;

import java.util.Arrays;
import java.util.Comparator;

class Lencomp implements Comparator
{

	@Override
	public int compare(Object arg0, Object arg1) {
		
		return ((String)arg0).length()-((String)arg1).length();
	}}
public class Demo2 {

	public static void main(String[] args) {
		String[] arr={"java","Android","C++","Dbms"};
		Arrays.sort(arr);
		for (String s : arr) {
			System.out.println(s);
		}
		System.out.println("++++++++++++");
		Arrays.sort(arr, new Lencomp());
		for (String s : arr) {
			System.out.println(s);
		}
	}

}
