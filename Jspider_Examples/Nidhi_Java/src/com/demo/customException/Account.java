package com.demo.customException;

public class Account {

	double bal;
	void withDrow(int amt)throws InsufficientFundException
	{
		if(amt>bal)
		{
			
			String s="short of "+(amt-bal)+"rs.";
			throw new InsufficientFundException(s);
		}
		
		bal-=amt;
		System.out.println(bal);	
}
}