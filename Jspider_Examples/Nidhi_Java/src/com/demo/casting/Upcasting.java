package com.demo.casting;

class Sim
{}
class Airtel extends Sim
{}
class Vodafon extends Sim
{}
class Applex
{
	void insertSim(Sim s)
	{
		System.out.println("sim is inserted phone");
	}}
public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Applex a=new Applex();
       a.insertSim(new Airtel());
       a.insertSim(new Vodafon());
	}

}
