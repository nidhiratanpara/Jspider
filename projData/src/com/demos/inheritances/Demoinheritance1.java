package com.demos.inheritances;


class Xx
{
	
	int i=10;
	void m1()
	{
		System.out.println(i);
	}
	}
class Yy extends Xx
{
  int j=20;
  void m2()
  {
	  System.out.println(i);
	  System.out.println(j);
  }
	}
public class Demoinheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Yy ya=new Yy();
       ya.m1();
       ya.m2();
       
	}

}
