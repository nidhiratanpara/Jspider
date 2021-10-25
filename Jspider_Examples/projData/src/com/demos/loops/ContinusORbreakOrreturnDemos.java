package com.demos.loops;

public class ContinusORbreakOrreturnDemos {
	//System.out.println("out side a J");
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		
		//break is break all after statement
	         for(int i=1;i<=10;i++)
             {
            	 System.out.println(i);
            	 if(i==5)break;
             }
            	 System.out.println("out side a I");
             
	
		
        //continue is skip present iteration and go next iteration
             for(int k=1;k<=10;k++)
             {
            	 
            	 if(k==5)continue;
            	 System.out.println(k);
             }
             System.out.println("out side a K");
             
             
          //return goto outside of method   
                 for(int j=1;j<=10;j++)
             {
            	 System.out.println(j);
            	 if(j==5)return;
             }
                 //this msg not print bcz control goes to main method
             System.out.println("out side a J");
             
	}
	  
}
