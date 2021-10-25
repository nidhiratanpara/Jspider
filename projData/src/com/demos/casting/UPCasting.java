package com.demos.casting;
class Sim
{
}
class Airtel extends Sim
{
}
class vodafon extends Sim
{
	}
class Aplex
{
	void insertsim(Sim s)
	{
		System.out.println("sim is inserted to phone");
	}
	}
public class UPCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aplex a=new Aplex();
		a.insertsim(new Airtel());
		a.insertsim(new vodafon());
	}

}
