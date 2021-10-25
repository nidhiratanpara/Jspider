package com.demos.equal;

class Rectangle
{
	int length;
	int breadth;
     Rectangle(int l,int b) {
		length=l;
		breadth=b;
	}
     public boolean equals(Object arg)
     {
    	 if(!(arg instanceof Rectangle))      return false;
    		 Rectangle r= (Rectangle)arg;
    		 return length==r.length && breadth==r.breadth;
    		 //return length==((Rectangle)arg).length && breadth==((Rectangle)arg).breadth;
     }
	}
public class Demo2 {

	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle(10, 20);
		Rectangle r2=new Rectangle(10, 20);
		System.out.println(r1==r2);
		System.out.println(r1.equals(r2));
		
 
	}

}
