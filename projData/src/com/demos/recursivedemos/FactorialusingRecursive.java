package com.demos.recursivedemos;

public class FactorialusingRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res=fact(5);
		System.out.println(res);

	}
    static int  fact(int a)
    {
    	if(a==0)
    		return 1;
    	return a*fact(a-1);
    	
    		
    }
}
