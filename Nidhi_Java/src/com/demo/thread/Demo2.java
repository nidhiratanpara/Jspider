package com.demo.thread;


class test {
	boolean valueSet=false;
	int n=0;
	void todo(){
	while(!valueSet)
		try {
           System.out.println("a =");
           System.out.println("b =");
			int a=10/n;
		} catch (ArithmeticException e) {
			System.out.println("InterruptedException caugth");
		}

	System.out.println("a =");
	valueSet=false;
	
	}
}

public class Demo2 {
	
	public static void main(String[] args) {
 test t = new test();
	t.todo();
	}
 }
