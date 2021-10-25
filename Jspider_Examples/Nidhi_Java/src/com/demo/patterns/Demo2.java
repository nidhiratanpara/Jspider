package com.demo.patterns;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("enter any number");
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int h=n;
          int w=1;
          int i,j,k;
          for ( i = 1; i <=n; i++) {
        	  for( k=1;k<h;k++)
        	  {
        		  System.out.print(" ");
        	  }
        	  for ( j = 1; j <=i; j++) {
        		  
        			if(j==1 || j==i)
        			{System.out.print(i+" ");}
        			else {
        				System.out.print("  ");
        			}
			}
        	  System.out.println();
			 h--;
          }
			
          //System.out.println(h);
   
				//	for(int  i1=n-1;i1>=1;i1--)
						for(int  i1=n-1;i1>=1;i1--)
					{
						for(int k1=1;k1<=w;k1++)
							//for(int k1=1;k1<=n-i1;k1++)
						{
						System.out.print(" ");
						}
					
					for( int j1=i1;j1>=1;j1--)
					{
						if(i1==j1 ||j1==1)
						{
							System.out.print(i1+" ");
							
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
