package com.demos.abstractdemos;

abstract class Car
{
	abstract void start();
	abstract void accelerate();
	abstract void stop();
	
}
class Benz extends Car
{
	      //method overloading//
	 void start()
     {
     	System.out.println("Benz starts");
     }
	void accelerate()
	{
		System.out.println("Benz accelerate");
	}
	void stop()
	{
		System.out.println("Benz stops");
	}
	}
class Audi extends Car
{
	  //method overloading//
	 void start()
     {
     	System.out.println("Audi starts");
     }
	void accelerate()
	{
		System.out.println("Audi accelerate");
	}
	void stop()
	{
		System.out.println("Audi stops");
	}
	}
class Driver
{
	// late binding
	void Drive(Car c)
	{
		c.start();
		c.accelerate();
		c.stop();
	}
	}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//upcasting//
		
		
		//Benz bb=new Benz();
		//Audi aa=new Audi();
		Driver dd=new Driver();
		dd.Drive(new Benz());
		dd.Drive(new Audi());
		 
	}

}


