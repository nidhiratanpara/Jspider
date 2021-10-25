package com.demos.thisdemo;

class Bbc
{
	public void withdrow()
	{
		System.out.println("w1 start");
		this.show();
		System.out.println("w1 ends");
	}
	void show()
	{
		System.out.println("i m show class()");
	}
	}
public class TwoUseOfThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bbc b=new Bbc();
		b.withdrow();
	}
	
	

}


