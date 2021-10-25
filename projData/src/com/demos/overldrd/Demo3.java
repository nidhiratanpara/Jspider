package com.demos.overldrd;


//method overriding demo 

class Phone
{
	void call()
	{
		System.out.println("call using 2g nw");
	}
}
class Cameraphone extends Phone
{
	void call()
	{
		System.out.println("call using 3g nw");
	}
}

public class Demo3 {
	public static void main(String[] ar)
	{
		Cameraphone c=new Cameraphone();
		c.call();
	}

}
