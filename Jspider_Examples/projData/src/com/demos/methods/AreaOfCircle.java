package com.demos.methods;

public class AreaOfCircle {
	
	static double  circle(int r)
	{
	   // return r*r*3.14;
		return 3.14*Math.pow(r,2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Area of circle="+circle(20));
	}

}
