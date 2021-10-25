package com.demos.constructor;



class Account
{
	static int count;
	Account()
	{
		//count++;
		System.out.println(count++);
	}
	}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new Account();
           new Account();
           new Account();
           new Account();
           System.out.println(Account.count+" "+"Acc created");
	}

}
