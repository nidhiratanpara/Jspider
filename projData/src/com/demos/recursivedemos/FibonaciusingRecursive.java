package com.demos.recursivedemos;

public class FibonaciusingRecursive {

	public static void main(String[] args) {
		int res=fib(5);
		System.out.println(res);
}
	public static int fib(int n) {
		if(n==1)
			return 0;
		if(n==2) 
			return 1;
		return fib(n-1)+fib(n-2);
		
	}
}
