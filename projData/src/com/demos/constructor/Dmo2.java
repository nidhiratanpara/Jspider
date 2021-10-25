package com.demos.constructor;

class B
{
	
}
class H
{
	H(int a)
	{
		System.out.println("C class constructor");
	}
}
public class Dmo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new B();
      new H(10);
	}

}
