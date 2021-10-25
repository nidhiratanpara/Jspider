package com.demo.abstractn;



public class Demo3 {

	public static void main(String[] args) {
		System.out.println("enter card type");
		java.util.Scanner scn=new java.util.Scanner(System.in);
		String s=scn.next();
		scn.close();
		
		Payable p=FactoryDemo3.getPay(s);
		if(p != null)
		{
			p.pay();
		}
		
	}

}
