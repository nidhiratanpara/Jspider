package com.demos.casting;

//early binding

class D
{
	int i=1;
	}

class E extends D
{
	int i=2;
		}
public class Demo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        D d=new E();
        System.out.println(d.i);
        E e=new E();
        System.out.println(e.i);
        
	}

}
