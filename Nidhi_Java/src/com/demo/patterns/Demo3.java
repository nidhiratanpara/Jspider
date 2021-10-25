package com.demo.patterns;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int w=5;
		for(int i=5;i>=1;i--)
		{
			for(int k=w;k>=1;k--)
			{
			System.out.print(" ");
			}
		
		for(int j=i;j>=1;j--)
		{
			if(i==j ||j==1)
			{
				System.out.print(i+" ");
				
			}
			else{
				System.out.print("  ");
			}
		}
		System.out.println();
		w++;
		}


			
	}

}
