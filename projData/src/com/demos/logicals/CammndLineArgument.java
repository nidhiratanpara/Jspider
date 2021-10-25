package com.demos.logicals;

public class CammndLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this program run on cmd
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("A+B="+(a+b));
        
        
        //2nd
        int sum=0;
        for(int i=0;i<args.length;i++)
        {
        	sum+=Integer.parseInt(args[i]);
        }
        System.out.println(sum);
        
	}

}
