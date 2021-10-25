package com.demo.interfaces;

interface Washble
{
	
}
class Car
{
	
	
	void start()
	{
		System.out.println("car start");
	}
	}
class Audi extends Car implements Washble
{
	
	void gps()
	{
		System.out.println("Audi GPS");
	}
	}
class Washer
{
	void wash(Car c)
	{
		if(c instanceof Washble)
		{
			System.out.println("wasble");
		}
		else
		{
			System.out.println("not washble");
		}
	}
	
}

public class MarkerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Washer w=new Washer();
		w.wash(new Car());
		w.wash(new Audi());
	}

}
