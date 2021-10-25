package com.demo.abstractn;



interface Payable
{
	void pay();
	}
class Cc implements Payable
{

	@Override
	public void pay() {
		
		System.out.println("amount pay by debitcard");
	}
	}
class Dc implements Payable{

	@Override
	public void pay() {
		
		System.out.println("amount pay by creaditcard");
	}
	
}
class Paytm implements Payable
{

	@Override
	public void pay() {
		
		System.out.println("amount pay by paytm");
	}
	}
public class FactoryDemo3 {
	
	public static Payable getPay(String s)
	{
		
		if(s.equalsIgnoreCase("cc"))
		{
			return new Cc();
		}
		else if (s.equalsIgnoreCase("Dc"))
		{
			return new Dc();
		}else if (s.equalsIgnoreCase("paytm"))
		{
			return new Paytm();
		}
		else
		{
			System.out.println("invalid opetion");
		}
		return null;
		}

}
