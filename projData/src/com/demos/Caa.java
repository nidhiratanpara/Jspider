package com.demos;
class Caa
{
        Caa()
        {
        	System.out.println("default");
        }
        Caa(int a)
        {
        	this();
        	System.out.println("one para");
        	
        }
        Caa(int a,int b)
        {
        	this(10);
        	System.out.println("two para");
        }
}
