package com.demos.grooming;
class D
{
	  int i=60;
	
	}
public class Demothis extends D {
		
	int j;
	Demothis(int i,int j)
	{
		this.i=i;
		this.j=j;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int y;
		//System.out.println(y);
		D d=new D();
		System.out.println(d.i);
        System.out.println(new Demothis(20,30).i);
       

	}
}


