package com.demos.classmembers;

import java.util.*;

class Account
{
	
	double bal;
	void displayBal()
	{
		System.out.println("current bal="+bal);
	}
	void withdrow(int amt)
	{
		if(amt>bal)
		{
			System.out.println("less balance");
			return;
		}
		bal-=amt;
		System.out.println("amt withdrow");
		
	}
	}

public class Static_nonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          Account a=new Account();
          a.bal=2000;
          Scanner sc=new Scanner(System.in);
          int n;
          do
          {
        	  System.out.println("type1 view bal");
        	  System.out.println("type2 withdrow bal");
        	  int opetion=sc.nextInt();
        	  switch (opetion)
        	  {
			case 1: a.displayBal();
				
				break;
				
         	case 2:System.out.println("enter amt");
         	int amt=sc.nextInt();
         	a.withdrow(amt);
				
				break;

			default:System.out.println("invalid input");
        	  }
        	  System.out.println(" 1-continue, any no to exit");
        	  n=sc.nextInt();
			}while (n==1); {
				System.out.println("thanks");
				
			}
          
	
          
	}

}
