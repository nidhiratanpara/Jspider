package com.demo.comparable;

import java.util.Arrays;

class Circle implements Comparable
{
	int radius;
	 Circle(int r) {
		radius=r;
	}

	@Override
	public int compareTo(Object arg0) {
		
		return radius-((Circle)arg0).radius;
	}
	public String toString()
	{
		return "Circle [radius="+radius+"]";
		
	}
	}
public class Demo1 {
public static void main(String[] args) {
	Circle[] arr={new Circle(20),
			      new Circle(10),
			      new Circle(30)};
	Arrays.sort(arr);
	for (Circle c : arr) {
		System.out.println(c);
	}
}
}
