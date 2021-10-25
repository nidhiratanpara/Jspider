package com.demo.constructors;

class Abc
{
	int a;
	int b;
	int c;
	
	Abc(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	Abc(Abc obj ,int c)
	{   a=obj.a;
	    b=obj.b;
		this.c=c;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc abc=new Abc(10,20);
		Abc abc1=new Abc(abc,20);
		System.out.println(abc.a+","+abc.b);
		System.out.println(abc.a+","+abc.b+","+abc.c);
		System.out.println(abc1.a+","+abc1.b+","+abc1.c);
		
	}

}
