package com.demo.arrays;

interface Animal
{
	void makesound();
	}
class Dog implements Animal
{
	@Override
	public void makesound() {
		System.out.println("bow bow");
	}}
class Cat implements Animal
{
	@Override
	public void makesound() {
		System.out.println("miow miow");
	}}
class Cow implements Animal
{
	@Override
	public void makesound() {
		System.out.println("COwwwww");
	}}

public class Demo5 {
public static void main(String[] args) {
	Animal[] a=new Animal[3];
	a[0]=new Cat();
	a[1]=new Cow();
	a[2]=new Dog();
	for (Animal animal : a) {
		animal.makesound();
		//System.out.println();
	}
}
}
