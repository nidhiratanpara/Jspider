package com.demos.overldrd;


class Animal
{
	void move()
	{
		System.out.println("running");
	}
	}
class Dog extends Animal
{
}
class Snake extends Dog
{
	
	//@override
	void move()
	{
		System.out.println("crawling");
	}
	}

public class Anotationoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Snake s=new Snake();
		s.move();
		Dog d=new Dog();
		d.move();
	}

}
