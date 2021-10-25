package com.demos.constructor;

class Box
{
	
	int height;
	int weidth;
	int length;
	Box()
	{
		System.out.println("default");
	}
	Box(int h,int w,int l)
	{
		height=h;
		weidth=w;
		length=l;
	}
	Box(int n)
	{
		height=n;
		weidth=n;
		length=n;
		
	}
	void display()
	{
		System.out.println("["+height+","+weidth+","+length+"]");
	}
	}

public class Demo5 {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
             Box b1=new Box();
            Box b2= new Box(10,20,30);
             Box b3=new Box(20);
             b1.display();
             b2.display();
             b3.display();
	}

}
