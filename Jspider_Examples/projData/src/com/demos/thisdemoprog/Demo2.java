package com.demos.thisdemoprog;


class Box
{
	
	int height;
	int weight;
	int length;
	Box()
	{
		this(10);
		System.out.println("default");
		
	}
	Box(int n)
	{
		this(n,n,n);
		System.out.println("1 args");
	}
	Box(int h,int w,int l)
	{
		height=h;
		weight=w;
		length=l;
		System.out.println("3 args");
	}
	void display()
	{
		System.out.println("height="+height+"weidth="+weight+"length="+length);
	}
	}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Box b1=new Box();
          Box b2=new Box(10,20,30);
          Box b3=new Box(10);
          b1.display();
          b2.display();
          b3.display();
          
	}

}
