package com.demo.overridings;


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
class Snake extends Animal
{
	@Override
	void move()
	{
		System.out.println("crawling");
	}
	}
public class Demo3 {

	public static void main(String[] args) {
		Snake s=new Snake();
		s.move();
		Dog d=new Dog();
		d.move();
	}
}
