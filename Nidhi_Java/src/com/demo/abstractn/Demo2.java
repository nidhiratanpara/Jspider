package com.demo.abstractn;


abstract class Car
{
	abstract void start();
	abstract void acceleater();
	abstract void stop();
	int i;
	static int b;
	Car()
	{}
	void m2()
	{
		System.out.println("hello");
	}
	}
class Audi extends Car
{
	void Gps()
	{
		System.out.println("audi gps");
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Audi start");
		
	}

	@Override
	void acceleater() {
		// TODO Auto-generated method stub
		System.out.println("Audi Acculator");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Audi stop");
	}
	}
class Benz extends Car
{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Benz start");
	}

	@Override
	void acceleater() {
		// TODO Auto-generated method stub
		System.out.println("Benz acculator");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Benz stop");
	}
	}
class Driver
{
	void drive(Car c)
	{
		if(c instanceof Audi)
		{
			((Audi) c).Gps();
		}
		c.start();
		c.acceleater();
		c.stop();
		c.m2();
	}}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver d=new Driver();
		  Car c1=new Benz();
		  d.drive(c1);
		  c1=new Audi();
		  d.drive(c1);
		 
         /* Benz b=new Benz();
          Audi a=new Audi();*/
          
         
          
	}

}
