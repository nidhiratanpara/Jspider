package com.demos.thisdemo;

 class Rectangl
{
	
	int length;
	int width;
	
	Rectangl(int length,int width)
	{
		this.length=length;
	    this.width=width;
	}
	
	void display()
	{
		System.out.println("["+length+","+width+"]");
	}
}

 
public class TestThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangl r=new Rectangl(20, 30);
		r.display();
	}

}
