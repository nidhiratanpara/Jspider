package com.demos.patterns;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		//2nd logic
		/*int star=5;
		 for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=star;j++)
        	{
        			System.out.print("*");
        	}
        	System.out.println("");
        	star--;
        }*/
	}

}
