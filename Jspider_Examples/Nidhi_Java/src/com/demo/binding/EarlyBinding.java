package com.demo.binding;

class E
{
	int i=10;
	
	}
class D extends E
{
	int i=20;
	}

public class EarlyBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           E e=new D();
           System.out.println(e.i);
           e=new E();
           System.out.println(e.i);
           
           
	}

}
