package com.demos.comparatar;
import java.util.Arrays;


class Circle implements Comparable
{
	int radius;
	Circle(int r)
	{
		radius=r;
	}
	
	public String toString()
	{
		return "Cricle[radius="+radius+"]";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return radius-((Circle)arg0).radius;
	}
	
	}

public class Demo2campratar  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Circle[] arr= {
			new Circle(50),
			new Circle(80),
			new Circle(70),
			new Circle(750),
			new Circle(90)
			};
	Arrays.sort(arr);
	for (Circle c : arr) {
		System.out.println(c);
		
	}
	
	}
}
